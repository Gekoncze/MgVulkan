package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalMemoryProperties.html">khronos documentation</a>
 **/
public class VulkanExternalMemoryProperties extends VulkanObject {
    public VulkanExternalMemoryProperties(){
        super(new VkExternalMemoryProperties());
    }

    public VulkanExternalMemoryProperties(VkExternalMemoryProperties vk){
        super(vk);
    }

    @Override
    public VkExternalMemoryProperties getVk(){
        return (VkExternalMemoryProperties) super.getVk();
    }

    public VulkanExternalMemoryProperties(VulkanExternalMemoryFeatureFlags externalMemoryFeatures, VulkanExternalMemoryHandleTypeFlags exportFromImportedHandleTypes, VulkanExternalMemoryHandleTypeFlags compatibleHandleTypes) {
        super(new VkExternalMemoryProperties(externalMemoryFeatures.getVk(), exportFromImportedHandleTypes.getVk(), compatibleHandleTypes.getVk()));
    }

    public VulkanExternalMemoryFeatureFlags getExternalMemoryFeatures() {
        return new VulkanExternalMemoryFeatureFlags(getVk().getExternalMemoryFeatures());
    }

    public void setExternalMemoryFeatures(VulkanExternalMemoryFeatureFlags externalMemoryFeatures) {
        getVk().setExternalMemoryFeatures(externalMemoryFeatures.getVk());
    }

    public VulkanExternalMemoryHandleTypeFlags getExportFromImportedHandleTypes() {
        return new VulkanExternalMemoryHandleTypeFlags(getVk().getExportFromImportedHandleTypes());
    }

    public void setExportFromImportedHandleTypes(VulkanExternalMemoryHandleTypeFlags exportFromImportedHandleTypes) {
        getVk().setExportFromImportedHandleTypes(exportFromImportedHandleTypes.getVk());
    }

    public VulkanExternalMemoryHandleTypeFlags getCompatibleHandleTypes() {
        return new VulkanExternalMemoryHandleTypeFlags(getVk().getCompatibleHandleTypes());
    }

    public void setCompatibleHandleTypes(VulkanExternalMemoryHandleTypeFlags compatibleHandleTypes) {
        getVk().setCompatibleHandleTypes(compatibleHandleTypes.getVk());
    }


    public static class Array extends VulkanExternalMemoryProperties implements cz.mg.collections.array.ReadonlyArray<VulkanExternalMemoryProperties> {
        public Array(VkExternalMemoryProperties.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkExternalMemoryProperties.Array(count));
        }

        public Array(int count, VulkanExternalMemoryProperties o){
            this(new VkExternalMemoryProperties.Array(count, o.getVk()));
        }

        @Override
        public VkExternalMemoryProperties.Array getVk(){
            return (VkExternalMemoryProperties.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanExternalMemoryProperties get(int i){
            return new VulkanExternalMemoryProperties(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkExternalMemoryProperties.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkExternalMemoryProperties.Pointer());
        }

        public Pointer(long value) {
            this(new VkExternalMemoryProperties.Pointer(value));
        }

        @Override
        public VkExternalMemoryProperties.Pointer getVk(){
            return (VkExternalMemoryProperties.Pointer) super.getVk();
        }

        public static class Array extends VulkanExternalMemoryProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanExternalMemoryProperties.Pointer> {
            public Array(int count) {
                super(new VkExternalMemoryProperties.Pointer.Array(count));
            }

            public Array(VulkanExternalMemoryProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkExternalMemoryProperties.Pointer.Array getVk(){
                return (VkExternalMemoryProperties.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanExternalMemoryProperties.Pointer get(int i){
                return new VulkanExternalMemoryProperties.Pointer(getVk().get(i));
            }
        }
    }
}
