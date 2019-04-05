package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDeviceQueueCreateInfo extends VulkanObject {
    public VulkanDeviceQueueCreateInfo(){
        super(new VkDeviceQueueCreateInfo());
    }

    public VulkanDeviceQueueCreateInfo(VkDeviceQueueCreateInfo vk){
        super(vk);
    }

    @Override
    public VkDeviceQueueCreateInfo getVk(){
        return (VkDeviceQueueCreateInfo) super.getVk();
    }
    public VulkanDeviceQueueCreateInfo(VulkanObject pNext, VulkanDeviceQueueCreateFlags flags, VulkanUInt32 queueFamilyIndex, VulkanUInt32 queueCount, VulkanFloat pQueuePriorities) {
        super(new VkDeviceQueueCreateInfo(pNext.getVk(), flags.getVk(), queueFamilyIndex.getVk(), queueCount.getVk(), pQueuePriorities.getVk()));
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

    public VulkanDeviceQueueCreateFlags getFlags() {
        return new VulkanDeviceQueueCreateFlags(getVk().getFlags());
    }

    public void setFlags(VulkanDeviceQueueCreateFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanUInt32 getQueueFamilyIndex() {
        return new VulkanUInt32(getVk().getQueueFamilyIndex());
    }

    public void setQueueFamilyIndex(VulkanUInt32 queueFamilyIndex) {
        getVk().setQueueFamilyIndex(queueFamilyIndex.getVk());
    }

    public VulkanUInt32 getQueueCount() {
        return new VulkanUInt32(getVk().getQueueCount());
    }

    public void setQueueCount(VulkanUInt32 queueCount) {
        getVk().setQueueCount(queueCount.getVk());
    }

    public VulkanFloat getPQueuePriorities() {
        return new VulkanFloat(getVk().getPQueuePriorities());
    }

    public void setPQueuePriorities(VulkanFloat pQueuePriorities) {
        getVk().setPQueuePriorities(pQueuePriorities.getVk());
    }


    public static class Array extends VulkanDeviceQueueCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceQueueCreateInfo> {
        public Array(VkDeviceQueueCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDeviceQueueCreateInfo.Array(count));
        }

        public Array(int count, VulkanDeviceQueueCreateInfo o){
            this(new VkDeviceQueueCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkDeviceQueueCreateInfo.Array getVk(){
            return (VkDeviceQueueCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDeviceQueueCreateInfo get(int i){
            return new VulkanDeviceQueueCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDeviceQueueCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDeviceQueueCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkDeviceQueueCreateInfo.Pointer(value));
        }

        @Override
        public VkDeviceQueueCreateInfo.Pointer getVk(){
            return (VkDeviceQueueCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanDeviceQueueCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceQueueCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkDeviceQueueCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanDeviceQueueCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDeviceQueueCreateInfo.Pointer.Array getVk(){
                return (VkDeviceQueueCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDeviceQueueCreateInfo.Pointer get(int i){
                return new VulkanDeviceQueueCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
