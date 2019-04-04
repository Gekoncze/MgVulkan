package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageViewCreateFlags.html">khronos documentation</a>
 **/
public class VulkanImageViewCreateFlags extends VulkanFlags {
    public VulkanImageViewCreateFlags(){
        super(new VkImageViewCreateFlags());
    }

    public VulkanImageViewCreateFlags(VkImageViewCreateFlags vk){
        super(vk);
    }

    @Override
    public VkImageViewCreateFlags getVk(){
        return (VkImageViewCreateFlags) super.getVk();
    }

    public VulkanImageViewCreateFlags(int value){
        super(new VkImageViewCreateFlags(value));
    }

    public static class Array extends VulkanImageViewCreateFlags implements cz.mg.collections.array.ReadonlyArray<VulkanImageViewCreateFlags> {
        public Array(VkImageViewCreateFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkImageViewCreateFlags.Array(count));
        }

        public Array(int count, VulkanImageViewCreateFlags o){
            this(new VkImageViewCreateFlags.Array(count, o.getVk()));
        }

        @Override
        public VkImageViewCreateFlags.Array getVk(){
            return (VkImageViewCreateFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanImageViewCreateFlags get(int i){
            return new VulkanImageViewCreateFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkImageViewCreateFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkImageViewCreateFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkImageViewCreateFlags.Pointer(value));
        }

        @Override
        public VkImageViewCreateFlags.Pointer getVk(){
            return (VkImageViewCreateFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanImageViewCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanImageViewCreateFlags.Pointer> {
            public Array(int count) {
                super(new VkImageViewCreateFlags.Pointer.Array(count));
            }

            public Array(VulkanImageViewCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkImageViewCreateFlags.Pointer.Array getVk(){
                return (VkImageViewCreateFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanImageViewCreateFlags.Pointer get(int i){
                return new VulkanImageViewCreateFlags.Pointer(getVk().get(i));
            }
        }
    }
}
