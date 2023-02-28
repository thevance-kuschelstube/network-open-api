package dev.pascxl.open.api.bukkit.item.inventory;

import dev.pascxl.open.api.bukkit.item.click.ClickableItem;
import dev.pascxl.open.api.bukkit.item.stack.ItemBuilder;
import lombok.Getter;
import lombok.experimental.Accessors;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.List;

/**
 * Created by Pascal K. on 19.12.2022.
 */
@Accessors(fluent = true)
@Getter
public abstract class PagefiedInventory<T> extends CustomInventory {

    private final List<T> elements;
    private final int[] possibleSlots;
    private int currentPage = 1;

    private final ItemStack NEXT_PAGE_ITEM = new ItemBuilder(Material.ARROW).displaname(
            MiniMessage.miniMessage().deserialize("<aqua>Next page")).build();
    private final ItemStack BE_PAGE_ITEM = new ItemBuilder(Material.ARROW).displaname(
            MiniMessage.miniMessage().deserialize("<aqua>Behavior page")
    ).build();

    private ClickableItem nextPageItem = ClickableItem.of(this.NEXT_PAGE_ITEM, player -> buildPage(++currentPage));
    private ClickableItem behaviorPageItem = ClickableItem.of(this.BE_PAGE_ITEM, player -> buildPage(--currentPage));

    private int nextPageItemSlot;
    private int behaviorPageItemSlot;

    public PagefiedInventory(Player player, int slots, boolean clickable, Component title, int[] possibleSlots, List<T> values) {
        super(player, slots, clickable, title);
        this.elements = values;
        this.possibleSlots = possibleSlots;
        this.fill();
        this.buildPage(1);
        this.behaviorPageItemSlot = slots - 9;
        this.nextPageItemSlot = slots;
    }

    public PagefiedInventory<T> nextPageItem(ClickableItem item) {
        this.nextPageItem = item;
        return this;
    }

    public PagefiedInventory<T> behaviorPageItem(ClickableItem item) {
        this.behaviorPageItem = item;
        return this;
    }

    public PagefiedInventory<T> nextPageItemSlot(int slot) {
        this.nextPageItemSlot = slot;
        return this;
    }

    public PagefiedInventory<T> behaviorPageItemSlot(int slot) {
        this.behaviorPageItemSlot = slot;
        return this;
    }

    public void fill() {
    }

    public void onPageChange(PagefiedInventory<T> inventory) {
        if (this.currentPage > 1) {
            setItem(this.behaviorPageItemSlot, this.behaviorPageItem);
        } else {
            removeItem(this.behaviorPageItemSlot);
        }

        if (this.elements.size() == this.possibleSlots.length) {
            removeItem(this.nextPageItemSlot);
        } else if (this.currentPage < this.maximalPage()) {
            setItem(this.nextPageItemSlot, this.nextPageItem);
        } else {
            removeItem(this.nextPageItemSlot);
        }
    }

    public void buildPage(int id) {

        this.currentPage = id;
        this.clear();

        int stepID = 0;
        for (T element : this.elements.subList(this.possibleSlots.length * (this.currentPage - 1),
                Math.min(this.elements.size(), this.possibleSlots.length * (this.currentPage - 1) + this.possibleSlots.length))) {
            setItem(this.possibleSlots[stepID], constructItem(element));
            stepID++;
        }
        onPageChange(this);
    }

    public void clear() {
        for (int slot : this.possibleSlots) {
            this.inventory().clear(slot);
        }
    }

    public int maximalPage() {
        return this.elements.size() / this.possibleSlots.length;
    }

    public abstract ClickableItem constructItem(T value);

}
