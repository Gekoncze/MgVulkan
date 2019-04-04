package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceEventTypeEXT.html">khronos documentation</a>
 **/
public class VulkanDeviceEventTypeEXT extends VulkanEnum {
    public static final int DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT = VkDeviceEventTypeEXT.VK_DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT;

    public VulkanDeviceEventTypeEXT(){
        super(new VkDeviceEventTypeEXT());
    }

    public VulkanDeviceEventTypeEXT(VkDeviceEventTypeEXT vk){
        super(vk);
    }

    @Override
    public VkDeviceEventTypeEXT getVk(){
        return (VkDeviceEventTypeEXT) super.getVk();
    }

    public VulkanDeviceEventTypeEXT(int value){
        super(new VkDeviceEventTypeEXT(value));
    }

    @Override
    public String toString() {
        if(getValue() == DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT) return "DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT";
        return "UNKNOWN";
    }

    public static class Array extends VulkanDeviceEventTypeEXT implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceEventTypeEXT> {
        public Array(VkDeviceEventTypeEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDeviceEventTypeEXT.Array(count));
        }

        public Array(int count, VulkanDeviceEventTypeEXT o){
            this(new VkDeviceEventTypeEXT.Array(count, o.getVk()));
        }

        @Override
        public VkDeviceEventTypeEXT.Array getVk(){
            return (VkDeviceEventTypeEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDeviceEventTypeEXT get(int i){
            return new VulkanDeviceEventTypeEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDeviceEventTypeEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDeviceEventTypeEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkDeviceEventTypeEXT.Pointer(value));
        }

        @Override
        public VkDeviceEventTypeEXT.Pointer getVk(){
            return (VkDeviceEventTypeEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanDeviceEventTypeEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceEventTypeEXT.Pointer> {
            public Array(int count) {
                super(new VkDeviceEventTypeEXT.Pointer.Array(count));
            }

            public Array(VulkanDeviceEventTypeEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDeviceEventTypeEXT.Pointer.Array getVk(){
                return (VkDeviceEventTypeEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDeviceEventTypeEXT.Pointer get(int i){
                return new VulkanDeviceEventTypeEXT.Pointer(getVk().get(i));
            }
        }
    }
}
