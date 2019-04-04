package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkQueryPool.html">khronos documentation</a>
 **/
public class VulkanQueryPool extends VulkanHandle {
    public VulkanQueryPool(){
        super(new VkQueryPool());
    }

    public VulkanQueryPool(VkQueryPool vk){
        super(vk);
    }

    @Override
    public VkQueryPool getVk(){
        return (VkQueryPool) super.getVk();
    }

    public VulkanQueryPool(int value){
        super(new VkQueryPool(value));
    }

    public static class Array extends VulkanQueryPool implements cz.mg.collections.array.ReadonlyArray<VulkanQueryPool> {
        public Array(VkQueryPool.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkQueryPool.Array(count));
        }

        public Array(int count, VulkanQueryPool o){
            this(new VkQueryPool.Array(count, o.getVk()));
        }

        @Override
        public VkQueryPool.Array getVk(){
            return (VkQueryPool.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanQueryPool get(int i){
            return new VulkanQueryPool(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkQueryPool.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkQueryPool.Pointer());
        }

        public Pointer(long value) {
            this(new VkQueryPool.Pointer(value));
        }

        @Override
        public VkQueryPool.Pointer getVk(){
            return (VkQueryPool.Pointer) super.getVk();
        }

        public static class Array extends VulkanQueryPool.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanQueryPool.Pointer> {
            public Array(int count) {
                super(new VkQueryPool.Pointer.Array(count));
            }

            public Array(VulkanQueryPool[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkQueryPool.Pointer.Array getVk(){
                return (VkQueryPool.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanQueryPool.Pointer get(int i){
                return new VulkanQueryPool.Pointer(getVk().get(i));
            }
        }
    }
}
