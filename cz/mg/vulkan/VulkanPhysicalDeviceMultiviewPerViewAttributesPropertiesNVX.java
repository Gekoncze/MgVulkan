package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX extends VulkanObject {
    public VulkanPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(){
        super(new VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX());
    }

    public VulkanPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX getVk(){
        return (VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX) super.getVk();
    }

    public VulkanPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(VulkanStructureType sType, VulkanObject pNext, VulkanBool32 perViewPositionAllComponents) {
        super(new VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(sType.getVk(), pNext.getVk(), perViewPositionAllComponents.getVk()));
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

    public VulkanBool32 getPerViewPositionAllComponents() {
        return new VulkanBool32(getVk().getPerViewPositionAllComponents());
    }

    public void setPerViewPositionAllComponents(VulkanBool32 perViewPositionAllComponents) {
        getVk().setPerViewPositionAllComponents(perViewPositionAllComponents.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX> {
        public Array(VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX o){
            this(new VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Array getVk(){
            return (VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX get(int i){
            return new VulkanPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Pointer getVk(){
            return (VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Pointer.Array getVk(){
                return (VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Pointer get(int i){
                return new VulkanPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Pointer(getVk().get(i));
            }
        }
    }
}
