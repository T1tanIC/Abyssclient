package me.ciruu.abyss.modules.client;

import com.mojang.realmsclient.gui.ChatFormatting;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import me.ciruu.abyss.Class185;
import me.ciruu.abyss.Class207;
import me.ciruu.abyss.Class350;
import me.ciruu.abyss.Class37;
import me.ciruu.abyss.Class40;
import me.ciruu.abyss.Class470;
import me.ciruu.abyss.Class498;
import me.ciruu.abyss.Class533;
import me.ciruu.abyss.Class636;
import me.ciruu.abyss.Globals;
import me.ciruu.abyss.enums.Class11;
import me.ciruu.abyss.enums.Class184;
import me.ciruu.abyss.events.network.EventNetworkPostPacketEvent;
import me.ciruu.abyss.modules.Module;
import me.ciruu.abyss.settings.Setting;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.EventHook;
import me.zero.alpine.listener.Listener;
import me.zero.alpine.listener.MethodRefListener;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.GuiNewChat;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class WebChat
extends Module {
    private final Setting openchat = new Setting("OpenChat", "", this, new Class207(0));
    private final Setting sound = new Setting("Sound", "", this, true);
    private final Setting color = new Setting("Color", "", this, (Object)Class184.WHITE);
    public static Set Field3252;
    public static Set Field3253;
    @EventHandler
    public static Listener Field3254;
    @EventHandler
    public static Listener Field3255;

    @NotNull
    public final Map Method1029() {
        Iterable iterable = this.Field3253;
        boolean bl = false;
        Iterable iterable2 = iterable;
        Collection collection = new ArrayList(Class636.Method3471(iterable, 10));
        boolean bl2 = false;
        Iterator iterator = Class636.Method3472(iterable2);
        while (Class636.Method3473(iterator)) {
            Object object = Class636.Method3474(iterator);
            String string = (String)object;
            Collection collection2 = collection;
            boolean bl3 = false;
            Pair pair = Class636.Method3476(string, Class636.Method3475(this.Field3252, string));
            Class636.Method3477(collection2, pair);
        }
        return Class636.Method3478((List)collection);
    }

    public void Method3927() {
        block2: {
            super.Method13();
            try {
                Class40.Field96.Method3734();
            }
            catch (Throwable throwable) {
                Class636.Method3481(throwable);
            }
        }
    }

    public void Method3930() {
        super.Method15();
        Class40.Field96.Method3735();
        Class636.Method3483(this.Field3253);
        Class636.Method3483(this.Field3252);
    }

    public final void Method3738(@NotNull List list, @NotNull List list2) {
        Class636.Method3483(this.Field3252);
        Class636.Method3484(this.Field3252, list);
        Class636.Method3483(this.Field3253);
        Class636.Method3484(this.Field3253, list2);
    }
    public static String string3;
    public final void Method3740(@NotNull String string) {
        Class636.Method3485(this.Field3252, string);
    }

    public final void Method3739(@NotNull String string) {
        Class636.Method3486(this.Field3252, string);
    }

    public final void Method3737(@NotNull String string, @NotNull String string2, @Nullable Instant instant) {

        GuiIngame guiIngame = Globals.mc.ingameGUI;
        if (guiIngame != null) {
            Class636.Method3489((GuiNewChat)guiIngame.getChatGUI(), (ITextComponent)new TextComponentString(string3));
        }
        if (Class636.Method3490((Boolean)this.sound.getValue()) && Class636.Method3492(string, Class636.Method3491(Globals.mc.player)) ^ true) {
            Class636.Method3493(Globals.mc.world, (EntityPlayer)Globals.mc.player, Globals.mc.player.posX, Globals.mc.player.posY, Globals.mc.player.posZ, Class470.Field3256, SoundCategory.PLAYERS, 10.0f, 1.0f);
        }
    }

    public final void Method3736() {
    }

    public WebChat() {
        super("WebChat", "", Class11.CLIENT);
        WebChat webChat = this;
        int n = 0;
        Object object = Class636.Method3494();
        webChat = this;
        n = 0;
        object = Class636.Method3494();
        webChat = this;
        n = 0;
        boolean bl = false;
        Function1 function12;
        webChat = this;
        n = 0;
        bl = false;
        Function1 function121;
    }

    public static final Setting Method2434(WebChat webChat) {
        return webChat.openchat;
    }
}
