package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSurfaceCapabilities2KHR extends VulkanObject {
    public VulkanSurfaceCapabilities2KHR(){
        super(new VkSurfaceCapabilities2KHR());
    }

    public VulkanSurfaceCapabilities2KHR(VkSurfaceCapabilities2KHR vk){
        super(vk);
    }

    @Override
    public VkSurfaceCapabilities2KHR getVk(){
        return (VkSurfaceCapabilities2KHR) super.getVk();
    }

    public VulkanSurfaceCapabilities2KHR(VulkanStructureType sType, VulkanObject pNext, VulkanSurfaceCapabilitiesKHR surfaceCapabilities) {
        super(new VkSurfaceCapabilities2KHR(sType.getVk(), pNext.getVk(), surfaceCapabilities.getVk()));
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

    public VulkanSurfaceCapabilitiesKHR getSurfaceCapabilities() {
        return new VulkanSurfaceCapabilitiesKHR(getVk().getSurfaceCapabilities());
    }

    public void setSurfaceCapabilities(VulkanSurfaceCapabilitiesKHR surfaceCapabilities) {
        getVk().setSurfaceCapabilities(surfaceCapabilities.getVk());
    }


    public static class Array extends VulkanSurfaceCapabilities2KHR implements cz.mg.collections.array.ReadonlyArray<VulkanSurfaceCapabilities2KHR> {
        public Array(VkSurfaceCapabilities2KHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSurfaceCapabilities2KHR.Array(count));
        }

        public Array(int count, VulkanSurfaceCapabilities2KHR o){
            this(new VkSurfaceCapabilities2KHR.Array(count, o.getVk()));
        }

        @Override
        public VkSurfaceCapabilities2KHR.Array getVk(){
            return (VkSurfaceCapabilities2KHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSurfaceCapabilities2KHR get(int i){
            return new VulkanSurfaceCapabilities2KHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSurfaceCapabilities2KHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSurfaceCapabilities2KHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkSurfaceCapabilities2KHR.Pointer(value));
        }

        @Override
        public VkSurfaceCapabilities2KHR.Pointer getVk(){
            return (VkSurfaceCapabilities2KHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanSurfaceCapabilities2KHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSurfaceCapabilities2KHR.Pointer> {
            public Array(int count) {
                super(new VkSurfaceCapabilities2KHR.Pointer.Array(count));
            }

            public Array(VulkanSurfaceCapabilities2KHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSurfaceCapabilities2KHR.Pointer.Array getVk(){
                return (VkSurfaceCapabilities2KHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSurfaceCapabilities2KHR.Pointer get(int i){
                return new VulkanSurfaceCapabilities2KHR.Pointer(getVk().get(i));
            }
        }
    }
}
