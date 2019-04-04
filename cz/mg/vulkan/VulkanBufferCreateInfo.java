package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkBufferCreateInfo.html">khronos documentation</a>
 **/
public class VulkanBufferCreateInfo extends VulkanObject {
    public VulkanBufferCreateInfo(){
        super(new VkBufferCreateInfo());
    }

    public VulkanBufferCreateInfo(VkBufferCreateInfo vk){
        super(vk);
    }

    @Override
    public VkBufferCreateInfo getVk(){
        return (VkBufferCreateInfo) super.getVk();
    }
    public VulkanBufferCreateInfo(VulkanObject pNext, VulkanBufferCreateFlags flags, VulkanDeviceSize size, VulkanBufferUsageFlags usage, VulkanSharingMode sharingMode, VulkanUInt32 queueFamilyIndexCount, VulkanUInt32 pQueueFamilyIndices) {
        super(new VkBufferCreateInfo(pNext.getVk(), flags.getVk(), size.getVk(), usage.getVk(), sharingMode.getVk(), queueFamilyIndexCount.getVk(), pQueueFamilyIndices.getVk()));
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

    public VulkanDeviceSize getSize() {
        return new VulkanDeviceSize(getVk().getSize());
    }

    public void setSize(VulkanDeviceSize size) {
        getVk().setSize(size.getVk());
    }

    public VulkanBufferUsageFlags getUsage() {
        return new VulkanBufferUsageFlags(getVk().getUsage());
    }

    public void setUsage(VulkanBufferUsageFlags usage) {
        getVk().setUsage(usage.getVk());
    }

    public VulkanSharingMode getSharingMode() {
        return new VulkanSharingMode(getVk().getSharingMode());
    }

    public void setSharingMode(VulkanSharingMode sharingMode) {
        getVk().setSharingMode(sharingMode.getVk());
    }

    public VulkanUInt32 getQueueFamilyIndexCount() {
        return new VulkanUInt32(getVk().getQueueFamilyIndexCount());
    }

    public void setQueueFamilyIndexCount(VulkanUInt32 queueFamilyIndexCount) {
        getVk().setQueueFamilyIndexCount(queueFamilyIndexCount.getVk());
    }

    public VulkanUInt32 getPQueueFamilyIndices() {
        return new VulkanUInt32(getVk().getPQueueFamilyIndices());
    }

    public void setPQueueFamilyIndices(VulkanUInt32 pQueueFamilyIndices) {
        getVk().setPQueueFamilyIndices(pQueueFamilyIndices.getVk());
    }


    public static class Array extends VulkanBufferCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanBufferCreateInfo> {
        public Array(VkBufferCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkBufferCreateInfo.Array(count));
        }

        public Array(int count, VulkanBufferCreateInfo o){
            this(new VkBufferCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkBufferCreateInfo.Array getVk(){
            return (VkBufferCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanBufferCreateInfo get(int i){
            return new VulkanBufferCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkBufferCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkBufferCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkBufferCreateInfo.Pointer(value));
        }

        @Override
        public VkBufferCreateInfo.Pointer getVk(){
            return (VkBufferCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanBufferCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanBufferCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkBufferCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanBufferCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkBufferCreateInfo.Pointer.Array getVk(){
                return (VkBufferCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanBufferCreateInfo.Pointer get(int i){
                return new VulkanBufferCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
