package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageCreateFlags.html">khronos documentation</a>
 **/
public class VulkanImageCreateFlags extends VulkanFlags {
    public VulkanImageCreateFlags(){
        super(new VkImageCreateFlags());
    }

    public VulkanImageCreateFlags(VkImageCreateFlags vk){
        super(vk);
    }

    @Override
    public VkImageCreateFlags getVk(){
        return (VkImageCreateFlags) super.getVk();
    }

    public VulkanImageCreateFlags(int value){
        super(new VkImageCreateFlags(value));
    }

    public static class Array extends VulkanImageCreateFlags implements cz.mg.collections.array.ReadonlyArray<VulkanImageCreateFlags> {
        public Array(VkImageCreateFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkImageCreateFlags.Array(count));
        }

        public Array(int count, VulkanImageCreateFlags o){
            this(new VkImageCreateFlags.Array(count, o.getVk()));
        }

        @Override
        public VkImageCreateFlags.Array getVk(){
            return (VkImageCreateFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanImageCreateFlags get(int i){
            return new VulkanImageCreateFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkImageCreateFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkImageCreateFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkImageCreateFlags.Pointer(value));
        }

        @Override
        public VkImageCreateFlags.Pointer getVk(){
            return (VkImageCreateFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanImageCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanImageCreateFlags.Pointer> {
            public Array(int count) {
                super(new VkImageCreateFlags.Pointer.Array(count));
            }

            public Array(VulkanImageCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkImageCreateFlags.Pointer.Array getVk(){
                return (VkImageCreateFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanImageCreateFlags.Pointer get(int i){
                return new VulkanImageCreateFlags.Pointer(getVk().get(i));
            }
        }
    }
}
