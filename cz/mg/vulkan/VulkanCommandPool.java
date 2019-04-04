package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCommandPool.html">khronos documentation</a>
 **/
public class VulkanCommandPool extends VulkanHandle {
    public VulkanCommandPool(){
        super(new VkCommandPool());
    }

    public VulkanCommandPool(VkCommandPool vk){
        super(vk);
    }

    @Override
    public VkCommandPool getVk(){
        return (VkCommandPool) super.getVk();
    }

    public VulkanCommandPool(int value){
        super(new VkCommandPool(value));
    }

    public static class Array extends VulkanCommandPool implements cz.mg.collections.array.ReadonlyArray<VulkanCommandPool> {
        public Array(VkCommandPool.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkCommandPool.Array(count));
        }

        public Array(int count, VulkanCommandPool o){
            this(new VkCommandPool.Array(count, o.getVk()));
        }

        @Override
        public VkCommandPool.Array getVk(){
            return (VkCommandPool.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanCommandPool get(int i){
            return new VulkanCommandPool(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkCommandPool.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkCommandPool.Pointer());
        }

        public Pointer(long value) {
            this(new VkCommandPool.Pointer(value));
        }

        @Override
        public VkCommandPool.Pointer getVk(){
            return (VkCommandPool.Pointer) super.getVk();
        }

        public static class Array extends VulkanCommandPool.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanCommandPool.Pointer> {
            public Array(int count) {
                super(new VkCommandPool.Pointer.Array(count));
            }

            public Array(VulkanCommandPool[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkCommandPool.Pointer.Array getVk(){
                return (VkCommandPool.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanCommandPool.Pointer get(int i){
                return new VulkanCommandPool.Pointer(getVk().get(i));
            }
        }
    }
}
