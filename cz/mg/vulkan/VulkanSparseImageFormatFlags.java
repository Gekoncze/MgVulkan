package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSparseImageFormatFlags.html">khronos documentation</a>
 **/
public class VulkanSparseImageFormatFlags extends VulkanFlags {
    public VulkanSparseImageFormatFlags(){
        super(new VkSparseImageFormatFlags());
    }

    public VulkanSparseImageFormatFlags(VkSparseImageFormatFlags vk){
        super(vk);
    }

    @Override
    public VkSparseImageFormatFlags getVk(){
        return (VkSparseImageFormatFlags) super.getVk();
    }

    public VulkanSparseImageFormatFlags(int value){
        super(new VkSparseImageFormatFlags(value));
    }

    public static class Array extends VulkanSparseImageFormatFlags implements cz.mg.collections.array.ReadonlyArray<VulkanSparseImageFormatFlags> {
        public Array(VkSparseImageFormatFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSparseImageFormatFlags.Array(count));
        }

        public Array(int count, VulkanSparseImageFormatFlags o){
            this(new VkSparseImageFormatFlags.Array(count, o.getVk()));
        }

        @Override
        public VkSparseImageFormatFlags.Array getVk(){
            return (VkSparseImageFormatFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSparseImageFormatFlags get(int i){
            return new VulkanSparseImageFormatFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSparseImageFormatFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSparseImageFormatFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkSparseImageFormatFlags.Pointer(value));
        }

        @Override
        public VkSparseImageFormatFlags.Pointer getVk(){
            return (VkSparseImageFormatFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanSparseImageFormatFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSparseImageFormatFlags.Pointer> {
            public Array(int count) {
                super(new VkSparseImageFormatFlags.Pointer.Array(count));
            }

            public Array(VulkanSparseImageFormatFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSparseImageFormatFlags.Pointer.Array getVk(){
                return (VkSparseImageFormatFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSparseImageFormatFlags.Pointer get(int i){
                return new VulkanSparseImageFormatFlags.Pointer(getVk().get(i));
            }
        }
    }
}
