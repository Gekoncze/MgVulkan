package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSparseMemoryBindFlags.html">khronos documentation</a>
 **/
public class VulkanSparseMemoryBindFlags extends VulkanFlags {
    public VulkanSparseMemoryBindFlags(){
        super(new VkSparseMemoryBindFlags());
    }

    public VulkanSparseMemoryBindFlags(VkSparseMemoryBindFlags vk){
        super(vk);
    }

    @Override
    public VkSparseMemoryBindFlags getVk(){
        return (VkSparseMemoryBindFlags) super.getVk();
    }

    public VulkanSparseMemoryBindFlags(int value){
        super(new VkSparseMemoryBindFlags(value));
    }

    public static class Array extends VulkanSparseMemoryBindFlags implements cz.mg.collections.array.ReadonlyArray<VulkanSparseMemoryBindFlags> {
        public Array(VkSparseMemoryBindFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSparseMemoryBindFlags.Array(count));
        }

        public Array(int count, VulkanSparseMemoryBindFlags o){
            this(new VkSparseMemoryBindFlags.Array(count, o.getVk()));
        }

        @Override
        public VkSparseMemoryBindFlags.Array getVk(){
            return (VkSparseMemoryBindFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSparseMemoryBindFlags get(int i){
            return new VulkanSparseMemoryBindFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSparseMemoryBindFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSparseMemoryBindFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkSparseMemoryBindFlags.Pointer(value));
        }

        @Override
        public VkSparseMemoryBindFlags.Pointer getVk(){
            return (VkSparseMemoryBindFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanSparseMemoryBindFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSparseMemoryBindFlags.Pointer> {
            public Array(int count) {
                super(new VkSparseMemoryBindFlags.Pointer.Array(count));
            }

            public Array(VulkanSparseMemoryBindFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSparseMemoryBindFlags.Pointer.Array getVk(){
                return (VkSparseMemoryBindFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSparseMemoryBindFlags.Pointer get(int i){
                return new VulkanSparseMemoryBindFlags.Pointer(getVk().get(i));
            }
        }
    }
}
