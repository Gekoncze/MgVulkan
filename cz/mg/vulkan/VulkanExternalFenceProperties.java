package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalFenceProperties.html">khronos documentation</a>
 **/
public class VulkanExternalFenceProperties extends VulkanObject {
    public VulkanExternalFenceProperties(){
        super(new VkExternalFenceProperties());
    }

    public VulkanExternalFenceProperties(VkExternalFenceProperties vk){
        super(vk);
    }

    @Override
    public VkExternalFenceProperties getVk(){
        return (VkExternalFenceProperties) super.getVk();
    }

    public VulkanExternalFenceProperties(VulkanStructureType sType, VulkanObject pNext, VulkanExternalFenceHandleTypeFlags exportFromImportedHandleTypes, VulkanExternalFenceHandleTypeFlags compatibleHandleTypes, VulkanExternalFenceFeatureFlags externalFenceFeatures) {
        super(new VkExternalFenceProperties(sType.getVk(), pNext.getVk(), exportFromImportedHandleTypes.getVk(), compatibleHandleTypes.getVk(), externalFenceFeatures.getVk()));
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

    public VulkanExternalFenceHandleTypeFlags getExportFromImportedHandleTypes() {
        return new VulkanExternalFenceHandleTypeFlags(getVk().getExportFromImportedHandleTypes());
    }

    public void setExportFromImportedHandleTypes(VulkanExternalFenceHandleTypeFlags exportFromImportedHandleTypes) {
        getVk().setExportFromImportedHandleTypes(exportFromImportedHandleTypes.getVk());
    }

    public VulkanExternalFenceHandleTypeFlags getCompatibleHandleTypes() {
        return new VulkanExternalFenceHandleTypeFlags(getVk().getCompatibleHandleTypes());
    }

    public void setCompatibleHandleTypes(VulkanExternalFenceHandleTypeFlags compatibleHandleTypes) {
        getVk().setCompatibleHandleTypes(compatibleHandleTypes.getVk());
    }

    public VulkanExternalFenceFeatureFlags getExternalFenceFeatures() {
        return new VulkanExternalFenceFeatureFlags(getVk().getExternalFenceFeatures());
    }

    public void setExternalFenceFeatures(VulkanExternalFenceFeatureFlags externalFenceFeatures) {
        getVk().setExternalFenceFeatures(externalFenceFeatures.getVk());
    }


    public static class Array extends VulkanExternalFenceProperties implements cz.mg.collections.array.ReadonlyArray<VulkanExternalFenceProperties> {
        public Array(VkExternalFenceProperties.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkExternalFenceProperties.Array(count));
        }

        public Array(int count, VulkanExternalFenceProperties o){
            this(new VkExternalFenceProperties.Array(count, o.getVk()));
        }

        @Override
        public VkExternalFenceProperties.Array getVk(){
            return (VkExternalFenceProperties.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanExternalFenceProperties get(int i){
            return new VulkanExternalFenceProperties(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkExternalFenceProperties.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkExternalFenceProperties.Pointer());
        }

        public Pointer(long value) {
            this(new VkExternalFenceProperties.Pointer(value));
        }

        @Override
        public VkExternalFenceProperties.Pointer getVk(){
            return (VkExternalFenceProperties.Pointer) super.getVk();
        }

        public static class Array extends VulkanExternalFenceProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanExternalFenceProperties.Pointer> {
            public Array(int count) {
                super(new VkExternalFenceProperties.Pointer.Array(count));
            }

            public Array(VulkanExternalFenceProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkExternalFenceProperties.Pointer.Array getVk(){
                return (VkExternalFenceProperties.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanExternalFenceProperties.Pointer get(int i){
                return new VulkanExternalFenceProperties.Pointer(getVk().get(i));
            }
        }
    }
}
