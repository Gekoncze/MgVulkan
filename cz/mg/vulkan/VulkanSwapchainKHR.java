package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSwapchainKHR.html">khronos documentation</a>
 **/
public class VulkanSwapchainKHR extends VulkanHandle {
    public VulkanSwapchainKHR(){
        super(new VkSwapchainKHR());
    }

    public VulkanSwapchainKHR(VkSwapchainKHR vk){
        super(vk);
    }

    @Override
    public VkSwapchainKHR getVk(){
        return (VkSwapchainKHR) super.getVk();
    }

    public VulkanSwapchainKHR(int value){
        super(new VkSwapchainKHR(value));
    }

    public static class Array extends VulkanSwapchainKHR implements cz.mg.collections.array.ReadonlyArray<VulkanSwapchainKHR> {
        public Array(VkSwapchainKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSwapchainKHR.Array(count));
        }

        public Array(int count, VulkanSwapchainKHR o){
            this(new VkSwapchainKHR.Array(count, o.getVk()));
        }

        @Override
        public VkSwapchainKHR.Array getVk(){
            return (VkSwapchainKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSwapchainKHR get(int i){
            return new VulkanSwapchainKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSwapchainKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSwapchainKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkSwapchainKHR.Pointer(value));
        }

        @Override
        public VkSwapchainKHR.Pointer getVk(){
            return (VkSwapchainKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanSwapchainKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSwapchainKHR.Pointer> {
            public Array(int count) {
                super(new VkSwapchainKHR.Pointer.Array(count));
            }

            public Array(VulkanSwapchainKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSwapchainKHR.Pointer.Array getVk(){
                return (VkSwapchainKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSwapchainKHR.Pointer get(int i){
                return new VulkanSwapchainKHR.Pointer(getVk().get(i));
            }
        }
    }
}
