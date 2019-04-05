package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSharedPresentSurfaceCapabilitiesKHR extends VulkanObject {
    public VulkanSharedPresentSurfaceCapabilitiesKHR(){
        super(new VkSharedPresentSurfaceCapabilitiesKHR());
    }

    public VulkanSharedPresentSurfaceCapabilitiesKHR(VkSharedPresentSurfaceCapabilitiesKHR vk){
        super(vk);
    }

    @Override
    public VkSharedPresentSurfaceCapabilitiesKHR getVk(){
        return (VkSharedPresentSurfaceCapabilitiesKHR) super.getVk();
    }

    public VulkanSharedPresentSurfaceCapabilitiesKHR(VulkanStructureType sType, VulkanObject pNext, VulkanImageUsageFlags sharedPresentSupportedUsageFlags) {
        super(new VkSharedPresentSurfaceCapabilitiesKHR(sType.getVk(), pNext.getVk(), sharedPresentSupportedUsageFlags.getVk()));
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

    public VulkanImageUsageFlags getSharedPresentSupportedUsageFlags() {
        return new VulkanImageUsageFlags(getVk().getSharedPresentSupportedUsageFlags());
    }

    public void setSharedPresentSupportedUsageFlags(VulkanImageUsageFlags sharedPresentSupportedUsageFlags) {
        getVk().setSharedPresentSupportedUsageFlags(sharedPresentSupportedUsageFlags.getVk());
    }


    public static class Array extends VulkanSharedPresentSurfaceCapabilitiesKHR implements cz.mg.collections.array.ReadonlyArray<VulkanSharedPresentSurfaceCapabilitiesKHR> {
        public Array(VkSharedPresentSurfaceCapabilitiesKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSharedPresentSurfaceCapabilitiesKHR.Array(count));
        }

        public Array(int count, VulkanSharedPresentSurfaceCapabilitiesKHR o){
            this(new VkSharedPresentSurfaceCapabilitiesKHR.Array(count, o.getVk()));
        }

        @Override
        public VkSharedPresentSurfaceCapabilitiesKHR.Array getVk(){
            return (VkSharedPresentSurfaceCapabilitiesKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSharedPresentSurfaceCapabilitiesKHR get(int i){
            return new VulkanSharedPresentSurfaceCapabilitiesKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSharedPresentSurfaceCapabilitiesKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSharedPresentSurfaceCapabilitiesKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkSharedPresentSurfaceCapabilitiesKHR.Pointer(value));
        }

        @Override
        public VkSharedPresentSurfaceCapabilitiesKHR.Pointer getVk(){
            return (VkSharedPresentSurfaceCapabilitiesKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanSharedPresentSurfaceCapabilitiesKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSharedPresentSurfaceCapabilitiesKHR.Pointer> {
            public Array(int count) {
                super(new VkSharedPresentSurfaceCapabilitiesKHR.Pointer.Array(count));
            }

            public Array(VulkanSharedPresentSurfaceCapabilitiesKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSharedPresentSurfaceCapabilitiesKHR.Pointer.Array getVk(){
                return (VkSharedPresentSurfaceCapabilitiesKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSharedPresentSurfaceCapabilitiesKHR.Pointer get(int i){
                return new VulkanSharedPresentSurfaceCapabilitiesKHR.Pointer(getVk().get(i));
            }
        }
    }
}
