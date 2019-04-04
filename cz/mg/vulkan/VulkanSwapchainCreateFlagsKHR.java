package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSwapchainCreateFlagsKHR.html">khronos documentation</a>
 **/
public class VulkanSwapchainCreateFlagsKHR extends VulkanFlags {
    public VulkanSwapchainCreateFlagsKHR(){
        super(new VkSwapchainCreateFlagsKHR());
    }

    public VulkanSwapchainCreateFlagsKHR(VkSwapchainCreateFlagsKHR vk){
        super(vk);
    }

    @Override
    public VkSwapchainCreateFlagsKHR getVk(){
        return (VkSwapchainCreateFlagsKHR) super.getVk();
    }

    public VulkanSwapchainCreateFlagsKHR(int value){
        super(new VkSwapchainCreateFlagsKHR(value));
    }

    public static class Array extends VulkanSwapchainCreateFlagsKHR implements cz.mg.collections.array.ReadonlyArray<VulkanSwapchainCreateFlagsKHR> {
        public Array(VkSwapchainCreateFlagsKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSwapchainCreateFlagsKHR.Array(count));
        }

        public Array(int count, VulkanSwapchainCreateFlagsKHR o){
            this(new VkSwapchainCreateFlagsKHR.Array(count, o.getVk()));
        }

        @Override
        public VkSwapchainCreateFlagsKHR.Array getVk(){
            return (VkSwapchainCreateFlagsKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSwapchainCreateFlagsKHR get(int i){
            return new VulkanSwapchainCreateFlagsKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSwapchainCreateFlagsKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSwapchainCreateFlagsKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkSwapchainCreateFlagsKHR.Pointer(value));
        }

        @Override
        public VkSwapchainCreateFlagsKHR.Pointer getVk(){
            return (VkSwapchainCreateFlagsKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanSwapchainCreateFlagsKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSwapchainCreateFlagsKHR.Pointer> {
            public Array(int count) {
                super(new VkSwapchainCreateFlagsKHR.Pointer.Array(count));
            }

            public Array(VulkanSwapchainCreateFlagsKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSwapchainCreateFlagsKHR.Pointer.Array getVk(){
                return (VkSwapchainCreateFlagsKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSwapchainCreateFlagsKHR.Pointer get(int i){
                return new VulkanSwapchainCreateFlagsKHR.Pointer(getVk().get(i));
            }
        }
    }
}
