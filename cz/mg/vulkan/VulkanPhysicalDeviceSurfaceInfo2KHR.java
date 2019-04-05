package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPhysicalDeviceSurfaceInfo2KHR extends VulkanObject {
    public VulkanPhysicalDeviceSurfaceInfo2KHR(){
        super(new VkPhysicalDeviceSurfaceInfo2KHR());
    }

    public VulkanPhysicalDeviceSurfaceInfo2KHR(VkPhysicalDeviceSurfaceInfo2KHR vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceSurfaceInfo2KHR getVk(){
        return (VkPhysicalDeviceSurfaceInfo2KHR) super.getVk();
    }
    public VulkanPhysicalDeviceSurfaceInfo2KHR(VulkanObject pNext, VulkanSurfaceKHR surface) {
        super(new VkPhysicalDeviceSurfaceInfo2KHR(pNext.getVk(), surface.getVk()));
    }

    public VulkanStructureType getSType() {
        return new VulkanStructureType(getVk().getSType());
    }

    public void setSType(VulkanStructureType sType) {
        getVk().setSType(sType.getVk());
    }

    public VulkanObject getPNext() {
        return new VulkanObject(getVk().getPNext());
    }

    public void setPNext(VulkanObject pNext) {
        getVk().setPNext(pNext.getVk());
    }

    public VulkanSurfaceKHR getSurface() {
        return new VulkanSurfaceKHR(getVk().getSurface());
    }

    public void setSurface(VulkanSurfaceKHR surface) {
        getVk().setSurface(surface.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceSurfaceInfo2KHR implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceSurfaceInfo2KHR> {
        public Array(VkPhysicalDeviceSurfaceInfo2KHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceSurfaceInfo2KHR.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceSurfaceInfo2KHR o){
            this(new VkPhysicalDeviceSurfaceInfo2KHR.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceSurfaceInfo2KHR.Array getVk(){
            return (VkPhysicalDeviceSurfaceInfo2KHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceSurfaceInfo2KHR get(int i){
            return new VulkanPhysicalDeviceSurfaceInfo2KHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceSurfaceInfo2KHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceSurfaceInfo2KHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceSurfaceInfo2KHR.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceSurfaceInfo2KHR.Pointer getVk(){
            return (VkPhysicalDeviceSurfaceInfo2KHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceSurfaceInfo2KHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceSurfaceInfo2KHR.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceSurfaceInfo2KHR.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceSurfaceInfo2KHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceSurfaceInfo2KHR.Pointer.Array getVk(){
                return (VkPhysicalDeviceSurfaceInfo2KHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceSurfaceInfo2KHR.Pointer get(int i){
                return new VulkanPhysicalDeviceSurfaceInfo2KHR.Pointer(getVk().get(i));
            }
        }
    }
}
