package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalImageFormatProperties.html">khronos documentation</a>
 **/
public class VulkanExternalImageFormatProperties extends VulkanObject {
    public VulkanExternalImageFormatProperties(){
        super(new VkExternalImageFormatProperties());
    }

    public VulkanExternalImageFormatProperties(VkExternalImageFormatProperties vk){
        super(vk);
    }

    @Override
    public VkExternalImageFormatProperties getVk(){
        return (VkExternalImageFormatProperties) super.getVk();
    }

    public VulkanExternalImageFormatProperties(VulkanStructureType sType, VulkanObject pNext, VulkanExternalMemoryProperties externalMemoryProperties) {
        super(new VkExternalImageFormatProperties(sType.getVk(), pNext.getVk(), externalMemoryProperties.getVk()));
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


    public static class Array extends VulkanExternalImageFormatProperties implements cz.mg.collections.array.ReadonlyArray<VulkanExternalImageFormatProperties> {
        public Array(VkExternalImageFormatProperties.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkExternalImageFormatProperties.Array(count));
        }

        public Array(int count, VulkanExternalImageFormatProperties o){
            this(new VkExternalImageFormatProperties.Array(count, o.getVk()));
        }

        @Override
        public VkExternalImageFormatProperties.Array getVk(){
            return (VkExternalImageFormatProperties.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanExternalImageFormatProperties get(int i){
            return new VulkanExternalImageFormatProperties(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkExternalImageFormatProperties.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkExternalImageFormatProperties.Pointer());
        }

        public Pointer(long value) {
            this(new VkExternalImageFormatProperties.Pointer(value));
        }

        @Override
        public VkExternalImageFormatProperties.Pointer getVk(){
            return (VkExternalImageFormatProperties.Pointer) super.getVk();
        }

        public static class Array extends VulkanExternalImageFormatProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanExternalImageFormatProperties.Pointer> {
            public Array(int count) {
                super(new VkExternalImageFormatProperties.Pointer.Array(count));
            }

            public Array(VulkanExternalImageFormatProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkExternalImageFormatProperties.Pointer.Array getVk(){
                return (VkExternalImageFormatProperties.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanExternalImageFormatProperties.Pointer get(int i){
                return new VulkanExternalImageFormatProperties.Pointer(getVk().get(i));
            }
        }
    }
}
