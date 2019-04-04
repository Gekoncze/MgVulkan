package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkObjectEntryUsageFlagBitsNVX.html">khronos documentation</a>
 **/
public class VulkanObjectEntryUsageFlagBitsNVX extends VulkanFlagBits {
    public static final int OBJECT_ENTRY_USAGE_GRAPHICS_NVX = VkObjectEntryUsageFlagBitsNVX.VK_OBJECT_ENTRY_USAGE_GRAPHICS_BIT_NVX;
    public static final int OBJECT_ENTRY_USAGE_COMPUTE_NVX = VkObjectEntryUsageFlagBitsNVX.VK_OBJECT_ENTRY_USAGE_COMPUTE_BIT_NVX;

    public VulkanObjectEntryUsageFlagBitsNVX(){
        super(new VkObjectEntryUsageFlagBitsNVX());
    }

    public VulkanObjectEntryUsageFlagBitsNVX(VkObjectEntryUsageFlagBitsNVX vk){
        super(vk);
    }

    @Override
    public VkObjectEntryUsageFlagBitsNVX getVk(){
        return (VkObjectEntryUsageFlagBitsNVX) super.getVk();
    }

    public VulkanObjectEntryUsageFlagBitsNVX(int value){
        super(new VkObjectEntryUsageFlagBitsNVX(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == OBJECT_ENTRY_USAGE_GRAPHICS_NVX) s += "OBJECT_ENTRY_USAGE_GRAPHICS_NVX";
        if(getValue() == OBJECT_ENTRY_USAGE_COMPUTE_NVX) s += "OBJECT_ENTRY_USAGE_COMPUTE_NVX";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanObjectEntryUsageFlagBitsNVX implements cz.mg.collections.array.ReadonlyArray<VulkanObjectEntryUsageFlagBitsNVX> {
        public Array(VkObjectEntryUsageFlagBitsNVX.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkObjectEntryUsageFlagBitsNVX.Array(count));
        }

        public Array(int count, VulkanObjectEntryUsageFlagBitsNVX o){
            this(new VkObjectEntryUsageFlagBitsNVX.Array(count, o.getVk()));
        }

        @Override
        public VkObjectEntryUsageFlagBitsNVX.Array getVk(){
            return (VkObjectEntryUsageFlagBitsNVX.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanObjectEntryUsageFlagBitsNVX get(int i){
            return new VulkanObjectEntryUsageFlagBitsNVX(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkObjectEntryUsageFlagBitsNVX.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkObjectEntryUsageFlagBitsNVX.Pointer());
        }

        public Pointer(long value) {
            this(new VkObjectEntryUsageFlagBitsNVX.Pointer(value));
        }

        @Override
        public VkObjectEntryUsageFlagBitsNVX.Pointer getVk(){
            return (VkObjectEntryUsageFlagBitsNVX.Pointer) super.getVk();
        }

        public static class Array extends VulkanObjectEntryUsageFlagBitsNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanObjectEntryUsageFlagBitsNVX.Pointer> {
            public Array(int count) {
                super(new VkObjectEntryUsageFlagBitsNVX.Pointer.Array(count));
            }

            public Array(VulkanObjectEntryUsageFlagBitsNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkObjectEntryUsageFlagBitsNVX.Pointer.Array getVk(){
                return (VkObjectEntryUsageFlagBitsNVX.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanObjectEntryUsageFlagBitsNVX.Pointer get(int i){
                return new VulkanObjectEntryUsageFlagBitsNVX.Pointer(getVk().get(i));
            }
        }
    }
}
