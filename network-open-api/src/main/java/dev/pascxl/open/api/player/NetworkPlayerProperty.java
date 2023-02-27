package dev.pascxl.open.api.player;

import com.google.gson.reflect.TypeToken;
import dev.pascxl.open.api.OpenAPI;
import dev.pascxl.open.api.mongodb.GsonToBsonAdapter;
import dev.pascxl.open.api.utilities.Catcher;
import dev.pascxl.open.api.utilities.Doubled;
import dev.pascxl.open.api.utilities.Runnabled;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bson.Document;

import java.util.List;

/**
 * Created by Pascal K. on 01.02.2023.
 */
@Getter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class NetworkPlayerProperty<E> {

    private Runnabled<Doubled<E, Document>> taskImplementation;

    private Catcher<E, Document> catcher;

    public static final NetworkPlayerProperty<Long> ONLINE_TIME = new NetworkPlayerProperty<>(longDocumentDoubled -> longDocumentDoubled.getSecond().append("Online-Time", longDocumentDoubled.getFirst()), document -> document.getLong("Online-Time"));

    public static final NetworkPlayerProperty<Long> FIRST_JOIN = new NetworkPlayerProperty<>(longDocumentDoubled -> longDocumentDoubled.getSecond().append("First-Join", longDocumentDoubled.getFirst()), document -> document.getLong("First-Join"));

    public static final NetworkPlayerProperty<Long> LAST_SEEN = new NetworkPlayerProperty<>(longDocumentDoubled -> longDocumentDoubled.getSecond().append("Last-Seen", longDocumentDoubled.getFirst()), document -> document.getLong("Last-Seen"));

    public static final NetworkPlayerProperty<String> PLAYER_NAME = new NetworkPlayerProperty<>(stringDocumentDoubled -> stringDocumentDoubled.getSecond().append("Active-Player-Name", stringDocumentDoubled.getFirst()), document -> document.getString("Active-Player-Name"));
    public static final NetworkPlayerProperty<String> CORE_RANK_ID = new NetworkPlayerProperty<>(stringDocumentDoubled -> stringDocumentDoubled.getSecond().append("Current-Core-Rank", stringDocumentDoubled.getFirst()), document -> document.getString("Current-Core-Rank"));

    public static final NetworkPlayerProperty<String> LANGUAGE_ID = new NetworkPlayerProperty<>(stringDocumentDoubled -> stringDocumentDoubled.getSecond().append("Active-Language-Id", stringDocumentDoubled.getFirst()), document -> document.getString("Active-Language-Id"));

    public static final NetworkPlayerProperty<String> IPv4_ADDRESS = new NetworkPlayerProperty<>(stringDocumentDoubled -> stringDocumentDoubled.getSecond().append("Active-IPv4-Address", stringDocumentDoubled.getFirst()), document -> document.getString("Active-IPv4-Address"));

    public static final NetworkPlayerProperty<String> DOMAIN = new NetworkPlayerProperty<>(stringDocumentDoubled -> stringDocumentDoubled.getSecond().append("Active-Domain-Profile", stringDocumentDoubled.getFirst()), document -> document.getString("Active-Domain-Profile"));

    public static final NetworkPlayerProperty<List<String>> NAME_LIST = new NetworkPlayerProperty<>(listDocumentDoubled -> listDocumentDoubled.getSecond().append("Player-Names", listDocumentDoubled.getFirst()), (Catcher<List<String>, Document>) document -> (List) document.get("Player-Names"));

    public static final NetworkPlayerProperty<List<String>> IPv4_LIST = new NetworkPlayerProperty<>(listDocumentDoubled -> listDocumentDoubled.getSecond().append("IPv4-Addresses", listDocumentDoubled.getFirst()), (Catcher<List<String>, Document>) document -> (List) document.get("IPv4-Addresses"));

    public static final NetworkPlayerProperty<List<String>> CORE_RANKS_LIST = new NetworkPlayerProperty<>(listDocumentDoubled -> listDocumentDoubled.getSecond().append("Old-Core-Ranks", listDocumentDoubled.getFirst()), (Catcher<List<String>, Document>) document -> (List) document.get("Old-Core-Ranks"));

    public static final NetworkPlayerProperty<Integer> COINS = new NetworkPlayerProperty<>(integerDocumentDoubled -> integerDocumentDoubled.getSecond().append("Coins", integerDocumentDoubled.getFirst()), document -> document.getInteger("Coins"));

    public static final NetworkPlayerProperty<Integer> FAVOURITE_GLASS_COLOR = new NetworkPlayerProperty<>(integerDocumentDoubled -> integerDocumentDoubled.getSecond().append("Favourite-Glass-Color", integerDocumentDoubled.getFirst()), document -> document.getInteger("Favourite-Glass-Color"));

    public static final NetworkPlayerProperty<Integer> GOLD = new NetworkPlayerProperty<>(integerDocumentDoubled -> integerDocumentDoubled.getSecond().append("Gold", integerDocumentDoubled.getFirst()), document -> document.getInteger("Gold"));

    public static final NetworkPlayerProperty<SkinData> SKIN = new NetworkPlayerProperty<>(clayerSkinDataDocumentDoubled -> {
        if (clayerSkinDataDocumentDoubled.getFirst() == null) {
            clayerSkinDataDocumentDoubled.getSecond().append("Skin-Data", null);
        } else
            clayerSkinDataDocumentDoubled.getSecond().append("Skin-Data", OpenAPI.instance().connectionHandler().gsonToBsonAdapter().document(clayerSkinDataDocumentDoubled.getFirst()));
    }, document -> {
        if (!document.containsKey("Skin-Data") || document.get("Skin-Data") == null) return null;
        return OpenAPI.instance().connectionHandler().gsonToBsonAdapter().objective((Document) document.get("Skin-Data"), new TypeToken<SkinData>() {
        }.getType());
    });

    public static final NetworkPlayerProperty<DiscordVerify> DISCORD_ID = new NetworkPlayerProperty<>(tsVerifyDocumentDoubled -> {
        if (tsVerifyDocumentDoubled.getFirst() == null) {
            tsVerifyDocumentDoubled.getSecond().append("Discord-Id", null);
        } else
            tsVerifyDocumentDoubled.getSecond().append("Discord-Id", OpenAPI.instance().connectionHandler().gsonToBsonAdapter().document(tsVerifyDocumentDoubled.getFirst()));
    }, document -> {
        if (!document.containsKey("Discord-Id") || document.get("Discord-Id") == null) return null;
        return OpenAPI.instance().connectionHandler().gsonToBsonAdapter().objective((Document) document.get("Discord-Id"), new TypeToken<DiscordVerify>() {
        }.getType());
    });

    public static final NetworkPlayerProperty<Boolean> NOTIFY_SERVICE_MESSAGING = new NetworkPlayerProperty<>(booleanDocumentDoubled -> booleanDocumentDoubled.getSecond().append("Notify-Service-Messaging", booleanDocumentDoubled.getFirst()), document -> document.getBoolean("Notify-Service-Messaging"));

    public static final NetworkPlayerProperty<Boolean> SCOREBOARD = new NetworkPlayerProperty<>(booleanDocumentDoubled -> booleanDocumentDoubled.getSecond().append("Scoreboard", booleanDocumentDoubled.getFirst()), document -> document.getBoolean("Scoreboard"));

    public static final NetworkPlayerProperty<Boolean> ANIMATIONS = new NetworkPlayerProperty<>(booleanDocumentDoubled -> booleanDocumentDoubled.getSecond().append("Animations", booleanDocumentDoubled.getFirst()), document -> document.getBoolean("Animations"));

    public static final NetworkPlayerProperty<Boolean> PARTICLE = new NetworkPlayerProperty<>(booleanDocumentDoubled -> booleanDocumentDoubled.getSecond().append("Particles", booleanDocumentDoubled.getFirst()), document -> document.getBoolean("Particles"));

    public static final NetworkPlayerProperty<Boolean> NOTIFY_STAFF_CHAT = new NetworkPlayerProperty<>(booleanDocumentDoubled -> booleanDocumentDoubled.getSecond().append("Notify-Staff-Chat", booleanDocumentDoubled.getFirst()), document -> document.getBoolean("Notify-Staff-Chat"));

    public static final NetworkPlayerProperty<Boolean> TEAM_AUTH = new NetworkPlayerProperty<>(booleanDocumentDoubled -> booleanDocumentDoubled.getSecond().append("Team-System-Auth", booleanDocumentDoubled.getFirst()), document -> document.getBoolean("Team-System-Auth"));

    public static final NetworkPlayerProperty<Boolean> NOTIFY_STAFF_CHAT_HIGH = new NetworkPlayerProperty<>(booleanDocumentDoubled -> booleanDocumentDoubled.getSecond().append("Notify-Staff-Chat-High", booleanDocumentDoubled.getFirst()), document -> document.getBoolean("Notify-Staff-Chat-High"));

    public static final NetworkPlayerProperty<Boolean> NOTIFY_JOIN_ME = new NetworkPlayerProperty<>(booleanDocumentDoubled -> booleanDocumentDoubled.getSecond().append("Notify-Join-Me", booleanDocumentDoubled.getFirst()), document -> document.getBoolean("Notify-Join-Me"));

    public static final NetworkPlayerProperty<Integer> CLIENT_VERSION = new NetworkPlayerProperty<>(integerDocumentDoubled -> integerDocumentDoubled.getSecond().append("Version", integerDocumentDoubled.getFirst()), document -> document.getInteger("Version"));

    public static final NetworkPlayerProperty<Boolean> NICK_SERVICE = new NetworkPlayerProperty<>(booleanDocumentDoubled -> booleanDocumentDoubled.getSecond().append("Nick-Service", booleanDocumentDoubled.getFirst()), document -> document.containsKey("Nick-Service") && document.getBoolean("Nick-Service"));

}