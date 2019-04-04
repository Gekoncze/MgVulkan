package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSemaphore.html">khronos documentation</a>
 **/
public class VulkanSemaphore extends VulkanHandle {
    public VulkanSemaphore(){
        super(new VkSemaphore());
    }

    public VulkanSemaphore(VkSemaphore vk){
        super(vk);
    }

    @Override
    public VkSemaphore getVk(){
        return (VkSemaphore) super.getVk();
    }

    public VulkanSemaphore(int value){
        super(new VkSemaphore(value));
    }

    public static class Array extends VulkanSemaphore implements cz.mg.collections.array.ReadonlyArray<VulkanSemaphore> {
        public Array(VkSemaphore.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSemaphore.Array(count));
        }

        public Array(int count, VulkanSemaphore o){
            this(new VkSemaphore.Array(count, o.getVk()));
        }

        @Override
        public VkSemaphore.Array getVk(){
            return (VkSemaphore.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSemaphore get(int i){
            return new VulkanSemaphore(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSemaphore.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSemaphore.Pointer());
        }

        public Pointer(long value) {
            this(new VkSemaphore.Pointer(value));
        }

        @Override
        public VkSemaphore.Pointer getVk(){
            return (VkSemaphore.Pointer) super.getVk();
        }

        public static class Array extends VulkanSemaphore.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSemaphore.Pointer> {
            public Array(int count) {
                super(new VkSemaphore.Pointer.Array(count));
            }

            public Array(VulkanSemaphore[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSemaphore.Pointer.Array getVk(){
                return (VkSemaphore.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSemaphore.Pointer get(int i){
                return new VulkanSemaphore.Pointer(getVk().get(i));
            }
        }
    }
}
