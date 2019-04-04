package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDisplayPowerStateEXT.html">khronos documentation</a>
 **/
public class VulkanDisplayPowerStateEXT extends VulkanEnum {
    public static final int DISPLAY_POWER_STATE_OFF_EXT = VkDisplayPowerStateEXT.VK_DISPLAY_POWER_STATE_OFF_EXT;
    public static final int DISPLAY_POWER_STATE_SUSPEND_EXT = VkDisplayPowerStateEXT.VK_DISPLAY_POWER_STATE_SUSPEND_EXT;
    public static final int DISPLAY_POWER_STATE_ON_EXT = VkDisplayPowerStateEXT.VK_DISPLAY_POWER_STATE_ON_EXT;

    public VulkanDisplayPowerStateEXT(){
        super(new VkDisplayPowerStateEXT());
    }

    public VulkanDisplayPowerStateEXT(VkDisplayPowerStateEXT vk){
        super(vk);
    }

    @Override
    public VkDisplayPowerStateEXT getVk(){
        return (VkDisplayPowerStateEXT) super.getVk();
    }

    public VulkanDisplayPowerStateEXT(int value){
        super(new VkDisplayPowerStateEXT(value));
    }

    @Override
    public String toString() {
        if(getValue() == DISPLAY_POWER_STATE_OFF_EXT) return "DISPLAY_POWER_STATE_OFF_EXT";
        if(getValue() == DISPLAY_POWER_STATE_SUSPEND_EXT) return "DISPLAY_POWER_STATE_SUSPEND_EXT";
        if(getValue() == DISPLAY_POWER_STATE_ON_EXT) return "DISPLAY_POWER_STATE_ON_EXT";
        return "UNKNOWN";
    }

    public static class Array extends VulkanDisplayPowerStateEXT implements cz.mg.collections.array.ReadonlyArray<VulkanDisplayPowerStateEXT> {
        public Array(VkDisplayPowerStateEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDisplayPowerStateEXT.Array(count));
        }

        public Array(int count, VulkanDisplayPowerStateEXT o){
            this(new VkDisplayPowerStateEXT.Array(count, o.getVk()));
        }

        @Override
        public VkDisplayPowerStateEXT.Array getVk(){
            return (VkDisplayPowerStateEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDisplayPowerStateEXT get(int i){
            return new VulkanDisplayPowerStateEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDisplayPowerStateEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDisplayPowerStateEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkDisplayPowerStateEXT.Pointer(value));
        }

        @Override
        public VkDisplayPowerStateEXT.Pointer getVk(){
            return (VkDisplayPowerStateEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanDisplayPowerStateEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDisplayPowerStateEXT.Pointer> {
            public Array(int count) {
                super(new VkDisplayPowerStateEXT.Pointer.Array(count));
            }

            public Array(VulkanDisplayPowerStateEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDisplayPowerStateEXT.Pointer.Array getVk(){
                return (VkDisplayPowerStateEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDisplayPowerStateEXT.Pointer get(int i){
                return new VulkanDisplayPowerStateEXT.Pointer(getVk().get(i));
            }
        }
    }
}
