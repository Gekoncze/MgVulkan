package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPhysicalDeviceExternalMemoryHostPropertiesEXT extends VulkanObject {
    public VulkanPhysicalDeviceExternalMemoryHostPropertiesEXT(){
        super(new VkPhysicalDeviceExternalMemoryHostPropertiesEXT());
    }

    public VulkanPhysicalDeviceExternalMemoryHostPropertiesEXT(VkPhysicalDeviceExternalMemoryHostPropertiesEXT vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT getVk(){
        return (VkPhysicalDeviceExternalMemoryHostPropertiesEXT) super.getVk();
    }

    public VulkanPhysicalDeviceExternalMemoryHostPropertiesEXT(VulkanStructureType sType, VulkanObject pNext, VulkanDeviceSize minImportedHostPointerAlignment) {
        super(new VkPhysicalDeviceExternalMemoryHostPropertiesEXT(sType.getVk(), pNext.getVk(), minImportedHostPointerAlignment.getVk()));
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

    public VulkanDeviceSize getMinImportedHostPointerAlignment() {
        return new VulkanDeviceSize(getVk().getMinImportedHostPointerAlignment());
    }

    public void setMinImportedHostPointerAlignment(VulkanDeviceSize minImportedHostPointerAlignment) {
        getVk().setMinImportedHostPointerAlignment(minImportedHostPointerAlignment.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceExternalMemoryHostPropertiesEXT implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceExternalMemoryHostPropertiesEXT> {
        public Array(VkPhysicalDeviceExternalMemoryHostPropertiesEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceExternalMemoryHostPropertiesEXT.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceExternalMemoryHostPropertiesEXT o){
            this(new VkPhysicalDeviceExternalMemoryHostPropertiesEXT.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceExternalMemoryHostPropertiesEXT.Array getVk(){
            return (VkPhysicalDeviceExternalMemoryHostPropertiesEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceExternalMemoryHostPropertiesEXT get(int i){
            return new VulkanPhysicalDeviceExternalMemoryHostPropertiesEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceExternalMemoryHostPropertiesEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceExternalMemoryHostPropertiesEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceExternalMemoryHostPropertiesEXT.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceExternalMemoryHostPropertiesEXT.Pointer getVk(){
            return (VkPhysicalDeviceExternalMemoryHostPropertiesEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceExternalMemoryHostPropertiesEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceExternalMemoryHostPropertiesEXT.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceExternalMemoryHostPropertiesEXT.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceExternalMemoryHostPropertiesEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceExternalMemoryHostPropertiesEXT.Pointer.Array getVk(){
                return (VkPhysicalDeviceExternalMemoryHostPropertiesEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceExternalMemoryHostPropertiesEXT.Pointer get(int i){
                return new VulkanPhysicalDeviceExternalMemoryHostPropertiesEXT.Pointer(getVk().get(i));
            }
        }
    }
}
