package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDeviceGroupPresentCapabilitiesKHR extends VulkanObject {
    public VulkanDeviceGroupPresentCapabilitiesKHR(){
        super(new VkDeviceGroupPresentCapabilitiesKHR());
    }

    public VulkanDeviceGroupPresentCapabilitiesKHR(VkDeviceGroupPresentCapabilitiesKHR vk){
        super(vk);
    }

    @Override
    public VkDeviceGroupPresentCapabilitiesKHR getVk(){
        return (VkDeviceGroupPresentCapabilitiesKHR) super.getVk();
    }

    public VulkanDeviceGroupPresentCapabilitiesKHR(VulkanStructureType sType, VulkanObject pNext, VulkanUInt32 presentMask, VulkanDeviceGroupPresentModeFlagsKHR modes) {
        super(new VkDeviceGroupPresentCapabilitiesKHR(sType.getVk(), pNext.getVk(), presentMask.getVk(), modes.getVk()));
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

    public VulkanUInt32 getPresentMask() {
        return new VulkanUInt32(getVk().getPresentMask());
    }

    public void setPresentMask(VulkanUInt32 presentMask) {
        getVk().setPresentMask(presentMask.getVk());
    }

    public VulkanDeviceGroupPresentModeFlagsKHR getModes() {
        return new VulkanDeviceGroupPresentModeFlagsKHR(getVk().getModes());
    }

    public void setModes(VulkanDeviceGroupPresentModeFlagsKHR modes) {
        getVk().setModes(modes.getVk());
    }


    public static class Array extends VulkanDeviceGroupPresentCapabilitiesKHR implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceGroupPresentCapabilitiesKHR> {
        public Array(VkDeviceGroupPresentCapabilitiesKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDeviceGroupPresentCapabilitiesKHR.Array(count));
        }

        public Array(int count, VulkanDeviceGroupPresentCapabilitiesKHR o){
            this(new VkDeviceGroupPresentCapabilitiesKHR.Array(count, o.getVk()));
        }

        @Override
        public VkDeviceGroupPresentCapabilitiesKHR.Array getVk(){
            return (VkDeviceGroupPresentCapabilitiesKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDeviceGroupPresentCapabilitiesKHR get(int i){
            return new VulkanDeviceGroupPresentCapabilitiesKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDeviceGroupPresentCapabilitiesKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDeviceGroupPresentCapabilitiesKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkDeviceGroupPresentCapabilitiesKHR.Pointer(value));
        }

        @Override
        public VkDeviceGroupPresentCapabilitiesKHR.Pointer getVk(){
            return (VkDeviceGroupPresentCapabilitiesKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanDeviceGroupPresentCapabilitiesKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceGroupPresentCapabilitiesKHR.Pointer> {
            public Array(int count) {
                super(new VkDeviceGroupPresentCapabilitiesKHR.Pointer.Array(count));
            }

            public Array(VulkanDeviceGroupPresentCapabilitiesKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDeviceGroupPresentCapabilitiesKHR.Pointer.Array getVk(){
                return (VkDeviceGroupPresentCapabilitiesKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDeviceGroupPresentCapabilitiesKHR.Pointer get(int i){
                return new VulkanDeviceGroupPresentCapabilitiesKHR.Pointer(getVk().get(i));
            }
        }
    }
}
