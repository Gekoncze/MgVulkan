package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSurfaceKHR.html">khronos documentation</a>
 **/
public class VulkanSurfaceKHR extends VulkanHandle {
    public VulkanSurfaceKHR(){
        super(new VkSurfaceKHR());
    }

    public VulkanSurfaceKHR(VkSurfaceKHR vk){
        super(vk);
    }

    @Override
    public VkSurfaceKHR getVk(){
        return (VkSurfaceKHR) super.getVk();
    }

    public VulkanSurfaceKHR(int value){
        super(new VkSurfaceKHR(value));
    }

    public static class Array extends VulkanSurfaceKHR implements cz.mg.collections.array.ReadonlyArray<VulkanSurfaceKHR> {
        public Array(VkSurfaceKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSurfaceKHR.Array(count));
        }

        public Array(int count, VulkanSurfaceKHR o){
            this(new VkSurfaceKHR.Array(count, o.getVk()));
        }

        @Override
        public VkSurfaceKHR.Array getVk(){
            return (VkSurfaceKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSurfaceKHR get(int i){
            return new VulkanSurfaceKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSurfaceKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSurfaceKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkSurfaceKHR.Pointer(value));
        }

        @Override
        public VkSurfaceKHR.Pointer getVk(){
            return (VkSurfaceKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanSurfaceKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSurfaceKHR.Pointer> {
            public Array(int count) {
                super(new VkSurfaceKHR.Pointer.Array(count));
            }

            public Array(VulkanSurfaceKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSurfaceKHR.Pointer.Array getVk(){
                return (VkSurfaceKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSurfaceKHR.Pointer get(int i){
                return new VulkanSurfaceKHR.Pointer(getVk().get(i));
            }
        }
    }
}
