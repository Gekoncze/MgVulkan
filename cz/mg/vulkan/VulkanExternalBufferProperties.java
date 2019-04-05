package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanExternalBufferProperties extends VulkanObject {
    public VulkanExternalBufferProperties(){
        super(new VkExternalBufferProperties());
    }

    public VulkanExternalBufferProperties(VkExternalBufferProperties vk){
        super(vk);
    }

    @Override
    public VkExternalBufferProperties getVk(){
        return (VkExternalBufferProperties) super.getVk();
    }

    public VulkanExternalBufferProperties(VulkanStructureType sType, VulkanObject pNext, VulkanExternalMemoryProperties externalMemoryProperties) {
        super(new VkExternalBufferProperties(sType.getVk(), pNext.getVk(), externalMemoryProperties.getVk()));
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

    public VulkanExternalMemoryProperties getExternalMemoryProperties() {
        return new VulkanExternalMemoryProperties(getVk().getExternalMemoryProperties());
    }

    public void setExternalMemoryProperties(VulkanExternalMemoryProperties externalMemoryProperties) {
        getVk().setExternalMemoryProperties(externalMemoryProperties.getVk());
    }


    public static class Array extends VulkanExternalBufferProperties implements cz.mg.collections.array.ReadonlyArray<VulkanExternalBufferProperties> {
        public Array(VkExternalBufferProperties.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkExternalBufferProperties.Array(count));
        }

        public Array(int count, VulkanExternalBufferProperties o){
            this(new VkExternalBufferProperties.Array(count, o.getVk()));
        }

        @Override
        public VkExternalBufferProperties.Array getVk(){
            return (VkExternalBufferProperties.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanExternalBufferProperties get(int i){
            return new VulkanExternalBufferProperties(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkExternalBufferProperties.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkExternalBufferProperties.Pointer());
        }

        public Pointer(long value) {
            this(new VkExternalBufferProperties.Pointer(value));
        }

        @Override
        public VkExternalBufferProperties.Pointer getVk(){
            return (VkExternalBufferProperties.Pointer) super.getVk();
        }

        public static class Array extends VulkanExternalBufferProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanExternalBufferProperties.Pointer> {
            public Array(int count) {
                super(new VkExternalBufferProperties.Pointer.Array(count));
            }

            public Array(VulkanExternalBufferProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkExternalBufferProperties.Pointer.Array getVk(){
                return (VkExternalBufferProperties.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanExternalBufferProperties.Pointer get(int i){
                return new VulkanExternalBufferProperties.Pointer(getVk().get(i));
            }
        }
    }
}
