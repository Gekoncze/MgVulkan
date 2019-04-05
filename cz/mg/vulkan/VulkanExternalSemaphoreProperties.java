package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanExternalSemaphoreProperties extends VulkanObject {
    public VulkanExternalSemaphoreProperties(){
        super(new VkExternalSemaphoreProperties());
    }

    public VulkanExternalSemaphoreProperties(VkExternalSemaphoreProperties vk){
        super(vk);
    }

    @Override
    public VkExternalSemaphoreProperties getVk(){
        return (VkExternalSemaphoreProperties) super.getVk();
    }

    public VulkanExternalSemaphoreProperties(VulkanStructureType sType, VulkanObject pNext, VulkanExternalSemaphoreHandleTypeFlags exportFromImportedHandleTypes, VulkanExternalSemaphoreHandleTypeFlags compatibleHandleTypes, VulkanExternalSemaphoreFeatureFlags externalSemaphoreFeatures) {
        super(new VkExternalSemaphoreProperties(sType.getVk(), pNext.getVk(), exportFromImportedHandleTypes.getVk(), compatibleHandleTypes.getVk(), externalSemaphoreFeatures.getVk()));
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

    public VulkanExternalSemaphoreHandleTypeFlags getExportFromImportedHandleTypes() {
        return new VulkanExternalSemaphoreHandleTypeFlags(getVk().getExportFromImportedHandleTypes());
    }

    public void setExportFromImportedHandleTypes(VulkanExternalSemaphoreHandleTypeFlags exportFromImportedHandleTypes) {
        getVk().setExportFromImportedHandleTypes(exportFromImportedHandleTypes.getVk());
    }

    public VulkanExternalSemaphoreHandleTypeFlags getCompatibleHandleTypes() {
        return new VulkanExternalSemaphoreHandleTypeFlags(getVk().getCompatibleHandleTypes());
    }

    public void setCompatibleHandleTypes(VulkanExternalSemaphoreHandleTypeFlags compatibleHandleTypes) {
        getVk().setCompatibleHandleTypes(compatibleHandleTypes.getVk());
    }

    public VulkanExternalSemaphoreFeatureFlags getExternalSemaphoreFeatures() {
        return new VulkanExternalSemaphoreFeatureFlags(getVk().getExternalSemaphoreFeatures());
    }

    public void setExternalSemaphoreFeatures(VulkanExternalSemaphoreFeatureFlags externalSemaphoreFeatures) {
        getVk().setExternalSemaphoreFeatures(externalSemaphoreFeatures.getVk());
    }


    public static class Array extends VulkanExternalSemaphoreProperties implements cz.mg.collections.array.ReadonlyArray<VulkanExternalSemaphoreProperties> {
        public Array(VkExternalSemaphoreProperties.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkExternalSemaphoreProperties.Array(count));
        }

        public Array(int count, VulkanExternalSemaphoreProperties o){
            this(new VkExternalSemaphoreProperties.Array(count, o.getVk()));
        }

        @Override
        public VkExternalSemaphoreProperties.Array getVk(){
            return (VkExternalSemaphoreProperties.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanExternalSemaphoreProperties get(int i){
            return new VulkanExternalSemaphoreProperties(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkExternalSemaphoreProperties.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkExternalSemaphoreProperties.Pointer());
        }

        public Pointer(long value) {
            this(new VkExternalSemaphoreProperties.Pointer(value));
        }

        @Override
        public VkExternalSemaphoreProperties.Pointer getVk(){
            return (VkExternalSemaphoreProperties.Pointer) super.getVk();
        }

        public static class Array extends VulkanExternalSemaphoreProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanExternalSemaphoreProperties.Pointer> {
            public Array(int count) {
                super(new VkExternalSemaphoreProperties.Pointer.Array(count));
            }

            public Array(VulkanExternalSemaphoreProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkExternalSemaphoreProperties.Pointer.Array getVk(){
                return (VkExternalSemaphoreProperties.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanExternalSemaphoreProperties.Pointer get(int i){
                return new VulkanExternalSemaphoreProperties.Pointer(getVk().get(i));
            }
        }
    }
}
