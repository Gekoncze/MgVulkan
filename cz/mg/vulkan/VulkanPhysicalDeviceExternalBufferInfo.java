package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPhysicalDeviceExternalBufferInfo extends VulkanObject {
    public VulkanPhysicalDeviceExternalBufferInfo(){
        super(new VkPhysicalDeviceExternalBufferInfo());
    }

    public VulkanPhysicalDeviceExternalBufferInfo(VkPhysicalDeviceExternalBufferInfo vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceExternalBufferInfo getVk(){
        return (VkPhysicalDeviceExternalBufferInfo) super.getVk();
    }
    public VulkanPhysicalDeviceExternalBufferInfo(VulkanObject pNext, VulkanBufferCreateFlags flags, VulkanBufferUsageFlags usage, VulkanExternalMemoryHandleTypeFlagBits handleType) {
        super(new VkPhysicalDeviceExternalBufferInfo(pNext.getVk(), flags.getVk(), usage.getVk(), handleType.getVk()));
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

    public VulkanBufferCreateFlags getFlags() {
        return new VulkanBufferCreateFlags(getVk().getFlags());
    }

    public void setFlags(VulkanBufferCreateFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanBufferUsageFlags getUsage() {
        return new VulkanBufferUsageFlags(getVk().getUsage());
    }

    public void setUsage(VulkanBufferUsageFlags usage) {
        getVk().setUsage(usage.getVk());
    }

    public VulkanExternalMemoryHandleTypeFlagBits getHandleType() {
        return new VulkanExternalMemoryHandleTypeFlagBits(getVk().getHandleType());
    }

    public void setHandleType(VulkanExternalMemoryHandleTypeFlagBits handleType) {
        getVk().setHandleType(handleType.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceExternalBufferInfo implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceExternalBufferInfo> {
        public Array(VkPhysicalDeviceExternalBufferInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceExternalBufferInfo.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceExternalBufferInfo o){
            this(new VkPhysicalDeviceExternalBufferInfo.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceExternalBufferInfo.Array getVk(){
            return (VkPhysicalDeviceExternalBufferInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceExternalBufferInfo get(int i){
            return new VulkanPhysicalDeviceExternalBufferInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceExternalBufferInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceExternalBufferInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceExternalBufferInfo.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceExternalBufferInfo.Pointer getVk(){
            return (VkPhysicalDeviceExternalBufferInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceExternalBufferInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceExternalBufferInfo.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceExternalBufferInfo.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceExternalBufferInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceExternalBufferInfo.Pointer.Array getVk(){
                return (VkPhysicalDeviceExternalBufferInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceExternalBufferInfo.Pointer get(int i){
                return new VulkanPhysicalDeviceExternalBufferInfo.Pointer(getVk().get(i));
            }
        }
    }
}
