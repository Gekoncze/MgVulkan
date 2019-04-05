package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPhysicalDevice16BitStorageFeatures extends VulkanObject {
    public VulkanPhysicalDevice16BitStorageFeatures(){
        super(new VkPhysicalDevice16BitStorageFeatures());
    }

    public VulkanPhysicalDevice16BitStorageFeatures(VkPhysicalDevice16BitStorageFeatures vk){
        super(vk);
    }

    @Override
    public VkPhysicalDevice16BitStorageFeatures getVk(){
        return (VkPhysicalDevice16BitStorageFeatures) super.getVk();
    }

    public VulkanPhysicalDevice16BitStorageFeatures(VulkanStructureType sType, VulkanObject pNext, VulkanBool32 storageBuffer16BitAccess, VulkanBool32 uniformAndStorageBuffer16BitAccess, VulkanBool32 storagePushConstant16, VulkanBool32 storageInputOutput16) {
        super(new VkPhysicalDevice16BitStorageFeatures(sType.getVk(), pNext.getVk(), storageBuffer16BitAccess.getVk(), uniformAndStorageBuffer16BitAccess.getVk(), storagePushConstant16.getVk(), storageInputOutput16.getVk()));
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

    public VulkanBool32 getStorageBuffer16BitAccess() {
        return new VulkanBool32(getVk().getStorageBuffer16BitAccess());
    }

    public void setStorageBuffer16BitAccess(VulkanBool32 storageBuffer16BitAccess) {
        getVk().setStorageBuffer16BitAccess(storageBuffer16BitAccess.getVk());
    }

    public VulkanBool32 getUniformAndStorageBuffer16BitAccess() {
        return new VulkanBool32(getVk().getUniformAndStorageBuffer16BitAccess());
    }

    public void setUniformAndStorageBuffer16BitAccess(VulkanBool32 uniformAndStorageBuffer16BitAccess) {
        getVk().setUniformAndStorageBuffer16BitAccess(uniformAndStorageBuffer16BitAccess.getVk());
    }

    public VulkanBool32 getStoragePushConstant16() {
        return new VulkanBool32(getVk().getStoragePushConstant16());
    }

    public void setStoragePushConstant16(VulkanBool32 storagePushConstant16) {
        getVk().setStoragePushConstant16(storagePushConstant16.getVk());
    }

    public VulkanBool32 getStorageInputOutput16() {
        return new VulkanBool32(getVk().getStorageInputOutput16());
    }

    public void setStorageInputOutput16(VulkanBool32 storageInputOutput16) {
        getVk().setStorageInputOutput16(storageInputOutput16.getVk());
    }


    public static class Array extends VulkanPhysicalDevice16BitStorageFeatures implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDevice16BitStorageFeatures> {
        public Array(VkPhysicalDevice16BitStorageFeatures.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDevice16BitStorageFeatures.Array(count));
        }

        public Array(int count, VulkanPhysicalDevice16BitStorageFeatures o){
            this(new VkPhysicalDevice16BitStorageFeatures.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDevice16BitStorageFeatures.Array getVk(){
            return (VkPhysicalDevice16BitStorageFeatures.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDevice16BitStorageFeatures get(int i){
            return new VulkanPhysicalDevice16BitStorageFeatures(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDevice16BitStorageFeatures.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDevice16BitStorageFeatures.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDevice16BitStorageFeatures.Pointer(value));
        }

        @Override
        public VkPhysicalDevice16BitStorageFeatures.Pointer getVk(){
            return (VkPhysicalDevice16BitStorageFeatures.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDevice16BitStorageFeatures.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDevice16BitStorageFeatures.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDevice16BitStorageFeatures.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDevice16BitStorageFeatures[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDevice16BitStorageFeatures.Pointer.Array getVk(){
                return (VkPhysicalDevice16BitStorageFeatures.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDevice16BitStorageFeatures.Pointer get(int i){
                return new VulkanPhysicalDevice16BitStorageFeatures.Pointer(getVk().get(i));
            }
        }
    }
}
