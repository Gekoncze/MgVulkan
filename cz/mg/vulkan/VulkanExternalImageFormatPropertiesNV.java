package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalImageFormatPropertiesNV.html">khronos documentation</a>
 **/
public class VulkanExternalImageFormatPropertiesNV extends VulkanObject {
    public VulkanExternalImageFormatPropertiesNV(){
        super(new VkExternalImageFormatPropertiesNV());
    }

    public VulkanExternalImageFormatPropertiesNV(VkExternalImageFormatPropertiesNV vk){
        super(vk);
    }

    @Override
    public VkExternalImageFormatPropertiesNV getVk(){
        return (VkExternalImageFormatPropertiesNV) super.getVk();
    }

    public VulkanExternalImageFormatPropertiesNV(VulkanImageFormatProperties imageFormatProperties, VulkanExternalMemoryFeatureFlagsNV externalMemoryFeatures, VulkanExternalMemoryHandleTypeFlagsNV exportFromImportedHandleTypes, VulkanExternalMemoryHandleTypeFlagsNV compatibleHandleTypes) {
        super(new VkExternalImageFormatPropertiesNV(imageFormatProperties.getVk(), externalMemoryFeatures.getVk(), exportFromImportedHandleTypes.getVk(), compatibleHandleTypes.getVk()));
    }

    public VulkanImageFormatProperties getImageFormatProperties() {
        return new VulkanImageFormatProperties(getVk().getImageFormatProperties());
    }

    public void setImageFormatProperties(VulkanImageFormatProperties imageFormatProperties) {
        getVk().setImageFormatProperties(imageFormatProperties.getVk());
    }

    public VulkanExternalMemoryFeatureFlagsNV getExternalMemoryFeatures() {
        return new VulkanExternalMemoryFeatureFlagsNV(getVk().getExternalMemoryFeatures());
    }

    public void setExternalMemoryFeatures(VulkanExternalMemoryFeatureFlagsNV externalMemoryFeatures) {
        getVk().setExternalMemoryFeatures(externalMemoryFeatures.getVk());
    }

    public VulkanExternalMemoryHandleTypeFlagsNV getExportFromImportedHandleTypes() {
        return new VulkanExternalMemoryHandleTypeFlagsNV(getVk().getExportFromImportedHandleTypes());
    }

    public void setExportFromImportedHandleTypes(VulkanExternalMemoryHandleTypeFlagsNV exportFromImportedHandleTypes) {
        getVk().setExportFromImportedHandleTypes(exportFromImportedHandleTypes.getVk());
    }

    public VulkanExternalMemoryHandleTypeFlagsNV getCompatibleHandleTypes() {
        return new VulkanExternalMemoryHandleTypeFlagsNV(getVk().getCompatibleHandleTypes());
    }

    public void setCompatibleHandleTypes(VulkanExternalMemoryHandleTypeFlagsNV compatibleHandleTypes) {
        getVk().setCompatibleHandleTypes(compatibleHandleTypes.getVk());
    }


    public static class Array extends VulkanExternalImageFormatPropertiesNV implements cz.mg.collections.array.ReadonlyArray<VulkanExternalImageFormatPropertiesNV> {
        public Array(VkExternalImageFormatPropertiesNV.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkExternalImageFormatPropertiesNV.Array(count));
        }

        public Array(int count, VulkanExternalImageFormatPropertiesNV o){
            this(new VkExternalImageFormatPropertiesNV.Array(count, o.getVk()));
        }

        @Override
        public VkExternalImageFormatPropertiesNV.Array getVk(){
            return (VkExternalImageFormatPropertiesNV.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanExternalImageFormatPropertiesNV get(int i){
            return new VulkanExternalImageFormatPropertiesNV(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkExternalImageFormatPropertiesNV.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkExternalImageFormatPropertiesNV.Pointer());
        }

        public Pointer(long value) {
            this(new VkExternalImageFormatPropertiesNV.Pointer(value));
        }

        @Override
        public VkExternalImageFormatPropertiesNV.Pointer getVk(){
            return (VkExternalImageFormatPropertiesNV.Pointer) super.getVk();
        }

        public static class Array extends VulkanExternalImageFormatPropertiesNV.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanExternalImageFormatPropertiesNV.Pointer> {
            public Array(int count) {
                super(new VkExternalImageFormatPropertiesNV.Pointer.Array(count));
            }

            public Array(VulkanExternalImageFormatPropertiesNV[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkExternalImageFormatPropertiesNV.Pointer.Array getVk(){
                return (VkExternalImageFormatPropertiesNV.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanExternalImageFormatPropertiesNV.Pointer get(int i){
                return new VulkanExternalImageFormatPropertiesNV.Pointer(getVk().get(i));
            }
        }
    }
}
