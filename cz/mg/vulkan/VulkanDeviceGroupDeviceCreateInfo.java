package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDeviceGroupDeviceCreateInfo extends VulkanObject {
    public VulkanDeviceGroupDeviceCreateInfo(){
        super(new VkDeviceGroupDeviceCreateInfo());
    }

    public VulkanDeviceGroupDeviceCreateInfo(VkDeviceGroupDeviceCreateInfo vk){
        super(vk);
    }

    @Override
    public VkDeviceGroupDeviceCreateInfo getVk(){
        return (VkDeviceGroupDeviceCreateInfo) super.getVk();
    }
    public VulkanDeviceGroupDeviceCreateInfo(VulkanObject pNext, VulkanUInt32 physicalDeviceCount, VulkanPhysicalDevice pPhysicalDevices) {
        super(new VkDeviceGroupDeviceCreateInfo(pNext.getVk(), physicalDeviceCount.getVk(), pPhysicalDevices.getVk()));
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

    public VulkanUInt32 getPhysicalDeviceCount() {
        return new VulkanUInt32(getVk().getPhysicalDeviceCount());
    }

    public void setPhysicalDeviceCount(VulkanUInt32 physicalDeviceCount) {
        getVk().setPhysicalDeviceCount(physicalDeviceCount.getVk());
    }

    public VulkanPhysicalDevice getPPhysicalDevices() {
        return new VulkanPhysicalDevice(getVk().getPPhysicalDevices());
    }

    public void setPPhysicalDevices(VulkanPhysicalDevice pPhysicalDevices) {
        getVk().setPPhysicalDevices(pPhysicalDevices.getVk());
    }


    public static class Array extends VulkanDeviceGroupDeviceCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceGroupDeviceCreateInfo> {
        public Array(VkDeviceGroupDeviceCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDeviceGroupDeviceCreateInfo.Array(count));
        }

        public Array(int count, VulkanDeviceGroupDeviceCreateInfo o){
            this(new VkDeviceGroupDeviceCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkDeviceGroupDeviceCreateInfo.Array getVk(){
            return (VkDeviceGroupDeviceCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDeviceGroupDeviceCreateInfo get(int i){
            return new VulkanDeviceGroupDeviceCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDeviceGroupDeviceCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDeviceGroupDeviceCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkDeviceGroupDeviceCreateInfo.Pointer(value));
        }

        @Override
        public VkDeviceGroupDeviceCreateInfo.Pointer getVk(){
            return (VkDeviceGroupDeviceCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanDeviceGroupDeviceCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceGroupDeviceCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkDeviceGroupDeviceCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanDeviceGroupDeviceCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDeviceGroupDeviceCreateInfo.Pointer.Array getVk(){
                return (VkDeviceGroupDeviceCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDeviceGroupDeviceCreateInfo.Pointer get(int i){
                return new VulkanDeviceGroupDeviceCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
