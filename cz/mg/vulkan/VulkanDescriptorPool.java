package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorPool.html">khronos documentation</a>
 **/
public class VulkanDescriptorPool extends VulkanHandle {
    public VulkanDescriptorPool(){
        super(new VkDescriptorPool());
    }

    public VulkanDescriptorPool(VkDescriptorPool vk){
        super(vk);
    }

    @Override
    public VkDescriptorPool getVk(){
        return (VkDescriptorPool) super.getVk();
    }

    public VulkanDescriptorPool(int value){
        super(new VkDescriptorPool(value));
    }

    public static class Array extends VulkanDescriptorPool implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorPool> {
        public Array(VkDescriptorPool.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDescriptorPool.Array(count));
        }

        public Array(int count, VulkanDescriptorPool o){
            this(new VkDescriptorPool.Array(count, o.getVk()));
        }

        @Override
        public VkDescriptorPool.Array getVk(){
            return (VkDescriptorPool.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDescriptorPool get(int i){
            return new VulkanDescriptorPool(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDescriptorPool.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDescriptorPool.Pointer());
        }

        public Pointer(long value) {
            this(new VkDescriptorPool.Pointer(value));
        }

        @Override
        public VkDescriptorPool.Pointer getVk(){
            return (VkDescriptorPool.Pointer) super.getVk();
        }

        public static class Array extends VulkanDescriptorPool.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorPool.Pointer> {
            public Array(int count) {
                super(new VkDescriptorPool.Pointer.Array(count));
            }

            public Array(VulkanDescriptorPool[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDescriptorPool.Pointer.Array getVk(){
                return (VkDescriptorPool.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDescriptorPool.Pointer get(int i){
                return new VulkanDescriptorPool.Pointer(getVk().get(i));
            }
        }
    }
}
