package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPhysicalDevicePushDescriptorPropertiesKHR extends VulkanObject {
    public VulkanPhysicalDevicePushDescriptorPropertiesKHR(){
        super(new VkPhysicalDevicePushDescriptorPropertiesKHR());
    }

    public VulkanPhysicalDevicePushDescriptorPropertiesKHR(VkPhysicalDevicePushDescriptorPropertiesKHR vk){
        super(vk);
    }

    @Override
    public VkPhysicalDevicePushDescriptorPropertiesKHR getVk(){
        return (VkPhysicalDevicePushDescriptorPropertiesKHR) super.getVk();
    }

    public VulkanPhysicalDevicePushDescriptorPropertiesKHR(VulkanStructureType sType, VulkanObject pNext, VulkanUInt32 maxPushDescriptors) {
        super(new VkPhysicalDevicePushDescriptorPropertiesKHR(sType.getVk(), pNext.getVk(), maxPushDescriptors.getVk()));
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

    public VulkanUInt32 getMaxPushDescriptors() {
        return new VulkanUInt32(getVk().getMaxPushDescriptors());
    }

    public void setMaxPushDescriptors(VulkanUInt32 maxPushDescriptors) {
        getVk().setMaxPushDescriptors(maxPushDescriptors.getVk());
    }


    public static class Array extends VulkanPhysicalDevicePushDescriptorPropertiesKHR implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDevicePushDescriptorPropertiesKHR> {
        public Array(VkPhysicalDevicePushDescriptorPropertiesKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDevicePushDescriptorPropertiesKHR.Array(count));
        }

        public Array(int count, VulkanPhysicalDevicePushDescriptorPropertiesKHR o){
            this(new VkPhysicalDevicePushDescriptorPropertiesKHR.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDevicePushDescriptorPropertiesKHR.Array getVk(){
            return (VkPhysicalDevicePushDescriptorPropertiesKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDevicePushDescriptorPropertiesKHR get(int i){
            return new VulkanPhysicalDevicePushDescriptorPropertiesKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDevicePushDescriptorPropertiesKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDevicePushDescriptorPropertiesKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDevicePushDescriptorPropertiesKHR.Pointer(value));
        }

        @Override
        public VkPhysicalDevicePushDescriptorPropertiesKHR.Pointer getVk(){
            return (VkPhysicalDevicePushDescriptorPropertiesKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDevicePushDescriptorPropertiesKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDevicePushDescriptorPropertiesKHR.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDevicePushDescriptorPropertiesKHR.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDevicePushDescriptorPropertiesKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDevicePushDescriptorPropertiesKHR.Pointer.Array getVk(){
                return (VkPhysicalDevicePushDescriptorPropertiesKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDevicePushDescriptorPropertiesKHR.Pointer get(int i){
                return new VulkanPhysicalDevicePushDescriptorPropertiesKHR.Pointer(getVk().get(i));
            }
        }
    }
}
