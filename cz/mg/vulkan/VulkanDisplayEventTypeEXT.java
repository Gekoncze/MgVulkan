package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDisplayEventTypeEXT.html">khronos documentation</a>
 **/
public class VulkanDisplayEventTypeEXT extends VulkanEnum {
    public static final int DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT = VkDisplayEventTypeEXT.VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT;

    public VulkanDisplayEventTypeEXT(){
        super(new VkDisplayEventTypeEXT());
    }

    public VulkanDisplayEventTypeEXT(VkDisplayEventTypeEXT vk){
        super(vk);
    }

    @Override
    public VkDisplayEventTypeEXT getVk(){
        return (VkDisplayEventTypeEXT) super.getVk();
    }

    public VulkanDisplayEventTypeEXT(int value){
        super(new VkDisplayEventTypeEXT(value));
    }

    @Override
    public String toString() {
        if(getValue() == DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT) return "DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT";
        return "UNKNOWN";
    }

    public static class Array extends VulkanDisplayEventTypeEXT implements cz.mg.collections.array.ReadonlyArray<VulkanDisplayEventTypeEXT> {
        public Array(VkDisplayEventTypeEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDisplayEventTypeEXT.Array(count));
        }

        public Array(int count, VulkanDisplayEventTypeEXT o){
            this(new VkDisplayEventTypeEXT.Array(count, o.getVk()));
        }

        @Override
        public VkDisplayEventTypeEXT.Array getVk(){
            return (VkDisplayEventTypeEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDisplayEventTypeEXT get(int i){
            return new VulkanDisplayEventTypeEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDisplayEventTypeEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDisplayEventTypeEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkDisplayEventTypeEXT.Pointer(value));
        }

        @Override
        public VkDisplayEventTypeEXT.Pointer getVk(){
            return (VkDisplayEventTypeEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanDisplayEventTypeEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDisplayEventTypeEXT.Pointer> {
            public Array(int count) {
                super(new VkDisplayEventTypeEXT.Pointer.Array(count));
            }

            public Array(VulkanDisplayEventTypeEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDisplayEventTypeEXT.Pointer.Array getVk(){
                return (VkDisplayEventTypeEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDisplayEventTypeEXT.Pointer get(int i){
                return new VulkanDisplayEventTypeEXT.Pointer(getVk().get(i));
            }
        }
    }
}
