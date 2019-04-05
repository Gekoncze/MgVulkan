package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDescriptorBufferInfo extends VulkanObject {
    public VulkanDescriptorBufferInfo(){
        super(new VkDescriptorBufferInfo());
    }

    public VulkanDescriptorBufferInfo(VkDescriptorBufferInfo vk){
        super(vk);
    }

    @Override
    public VkDescriptorBufferInfo getVk(){
        return (VkDescriptorBufferInfo) super.getVk();
    }

    public VulkanDescriptorBufferInfo(VulkanBuffer buffer, VulkanDeviceSize offset, VulkanDeviceSize range) {
        super(new VkDescriptorBufferInfo(buffer.getVk(), offset.getVk(), range.getVk()));
    }

    public VulkanBuffer getBuffer() {
        return new VulkanBuffer(getVk().getBuffer());
    }

    public void setBuffer(VulkanBuffer buffer) {
        getVk().setBuffer(buffer.getVk());
    }

    public VulkanDeviceSize getOffset() {
        return new VulkanDeviceSize(getVk().getOffset());
    }

    public void setOffset(VulkanDeviceSize offset) {
        getVk().setOffset(offset.getVk());
    }

    public VulkanDeviceSize getRange() {
        return new VulkanDeviceSize(getVk().getRange());
    }

    public void setRange(VulkanDeviceSize range) {
        getVk().setRange(range.getVk());
    }


    public static class Array extends VulkanDescriptorBufferInfo implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorBufferInfo> {
        public Array(VkDescriptorBufferInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDescriptorBufferInfo.Array(count));
        }

        public Array(int count, VulkanDescriptorBufferInfo o){
            this(new VkDescriptorBufferInfo.Array(count, o.getVk()));
        }

        @Override
        public VkDescriptorBufferInfo.Array getVk(){
            return (VkDescriptorBufferInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDescriptorBufferInfo get(int i){
            return new VulkanDescriptorBufferInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDescriptorBufferInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDescriptorBufferInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkDescriptorBufferInfo.Pointer(value));
        }

        @Override
        public VkDescriptorBufferInfo.Pointer getVk(){
            return (VkDescriptorBufferInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanDescriptorBufferInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorBufferInfo.Pointer> {
            public Array(int count) {
                super(new VkDescriptorBufferInfo.Pointer.Array(count));
            }

            public Array(VulkanDescriptorBufferInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDescriptorBufferInfo.Pointer.Array getVk(){
                return (VkDescriptorBufferInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDescriptorBufferInfo.Pointer get(int i){
                return new VulkanDescriptorBufferInfo.Pointer(getVk().get(i));
            }
        }
    }
}
