package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanVertexInputAttributeDescription extends VulkanObject {
    public VulkanVertexInputAttributeDescription(){
        super(new VkVertexInputAttributeDescription());
    }

    public VulkanVertexInputAttributeDescription(VkVertexInputAttributeDescription vk){
        super(vk);
    }

    @Override
    public VkVertexInputAttributeDescription getVk(){
        return (VkVertexInputAttributeDescription) super.getVk();
    }

    public VulkanVertexInputAttributeDescription(VulkanUInt32 location, VulkanUInt32 binding, VulkanFormat format, VulkanUInt32 offset) {
        super(new VkVertexInputAttributeDescription(location.getVk(), binding.getVk(), format.getVk(), offset.getVk()));
    }

    public VulkanUInt32 getLocation() {
        return new VulkanUInt32(getVk().getLocation());
    }

    public void setLocation(VulkanUInt32 location) {
        getVk().setLocation(location.getVk());
    }

    public VulkanUInt32 getBinding() {
        return new VulkanUInt32(getVk().getBinding());
    }

    public void setBinding(VulkanUInt32 binding) {
        getVk().setBinding(binding.getVk());
    }

    public VulkanFormat getFormat() {
        return new VulkanFormat(getVk().getFormat());
    }

    public void setFormat(VulkanFormat format) {
        getVk().setFormat(format.getVk());
    }

    public VulkanUInt32 getOffset() {
        return new VulkanUInt32(getVk().getOffset());
    }

    public void setOffset(VulkanUInt32 offset) {
        getVk().setOffset(offset.getVk());
    }


    public static class Array extends VulkanVertexInputAttributeDescription implements cz.mg.collections.array.ReadonlyArray<VulkanVertexInputAttributeDescription> {
        public Array(VkVertexInputAttributeDescription.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkVertexInputAttributeDescription.Array(count));
        }

        public Array(int count, VulkanVertexInputAttributeDescription o){
            this(new VkVertexInputAttributeDescription.Array(count, o.getVk()));
        }

        @Override
        public VkVertexInputAttributeDescription.Array getVk(){
            return (VkVertexInputAttributeDescription.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanVertexInputAttributeDescription get(int i){
            return new VulkanVertexInputAttributeDescription(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkVertexInputAttributeDescription.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkVertexInputAttributeDescription.Pointer());
        }

        public Pointer(long value) {
            this(new VkVertexInputAttributeDescription.Pointer(value));
        }

        @Override
        public VkVertexInputAttributeDescription.Pointer getVk(){
            return (VkVertexInputAttributeDescription.Pointer) super.getVk();
        }

        public static class Array extends VulkanVertexInputAttributeDescription.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanVertexInputAttributeDescription.Pointer> {
            public Array(int count) {
                super(new VkVertexInputAttributeDescription.Pointer.Array(count));
            }

            public Array(VulkanVertexInputAttributeDescription[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkVertexInputAttributeDescription.Pointer.Array getVk(){
                return (VkVertexInputAttributeDescription.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanVertexInputAttributeDescription.Pointer get(int i){
                return new VulkanVertexInputAttributeDescription.Pointer(getVk().get(i));
            }
        }
    }
}
