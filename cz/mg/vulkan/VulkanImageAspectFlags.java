package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageAspectFlags.html">khronos documentation</a>
 **/
public class VulkanImageAspectFlags extends VulkanFlags {
    public VulkanImageAspectFlags(){
        super(new VkImageAspectFlags());
    }

    public VulkanImageAspectFlags(VkImageAspectFlags vk){
        super(vk);
    }

    @Override
    public VkImageAspectFlags getVk(){
        return (VkImageAspectFlags) super.getVk();
    }

    public VulkanImageAspectFlags(int value){
        super(new VkImageAspectFlags(value));
    }

    public static class Array extends VulkanImageAspectFlags implements cz.mg.collections.array.ReadonlyArray<VulkanImageAspectFlags> {
        public Array(VkImageAspectFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkImageAspectFlags.Array(count));
        }

        public Array(int count, VulkanImageAspectFlags o){
            this(new VkImageAspectFlags.Array(count, o.getVk()));
        }

        @Override
        public VkImageAspectFlags.Array getVk(){
            return (VkImageAspectFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanImageAspectFlags get(int i){
            return new VulkanImageAspectFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkImageAspectFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkImageAspectFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkImageAspectFlags.Pointer(value));
        }

        @Override
        public VkImageAspectFlags.Pointer getVk(){
            return (VkImageAspectFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanImageAspectFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanImageAspectFlags.Pointer> {
            public Array(int count) {
                super(new VkImageAspectFlags.Pointer.Array(count));
            }

            public Array(VulkanImageAspectFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkImageAspectFlags.Pointer.Array getVk(){
                return (VkImageAspectFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanImageAspectFlags.Pointer get(int i){
                return new VulkanImageAspectFlags.Pointer(getVk().get(i));
            }
        }
    }
}
