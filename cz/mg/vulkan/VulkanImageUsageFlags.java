package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageUsageFlags.html">khronos documentation</a>
 **/
public class VulkanImageUsageFlags extends VulkanFlags {
    public VulkanImageUsageFlags(){
        super(new VkImageUsageFlags());
    }

    public VulkanImageUsageFlags(VkImageUsageFlags vk){
        super(vk);
    }

    @Override
    public VkImageUsageFlags getVk(){
        return (VkImageUsageFlags) super.getVk();
    }

    public VulkanImageUsageFlags(int value){
        super(new VkImageUsageFlags(value));
    }

    public static class Array extends VulkanImageUsageFlags implements cz.mg.collections.array.ReadonlyArray<VulkanImageUsageFlags> {
        public Array(VkImageUsageFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkImageUsageFlags.Array(count));
        }

        public Array(int count, VulkanImageUsageFlags o){
            this(new VkImageUsageFlags.Array(count, o.getVk()));
        }

        @Override
        public VkImageUsageFlags.Array getVk(){
            return (VkImageUsageFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanImageUsageFlags get(int i){
            return new VulkanImageUsageFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkImageUsageFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkImageUsageFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkImageUsageFlags.Pointer(value));
        }

        @Override
        public VkImageUsageFlags.Pointer getVk(){
            return (VkImageUsageFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanImageUsageFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanImageUsageFlags.Pointer> {
            public Array(int count) {
                super(new VkImageUsageFlags.Pointer.Array(count));
            }

            public Array(VulkanImageUsageFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkImageUsageFlags.Pointer.Array getVk(){
                return (VkImageUsageFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanImageUsageFlags.Pointer get(int i){
                return new VulkanImageUsageFlags.Pointer(getVk().get(i));
            }
        }
    }
}
