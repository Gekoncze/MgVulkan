package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPhysicalDeviceSamplerFilterMinmaxPropertiesEXT extends VulkanObject {
    public VulkanPhysicalDeviceSamplerFilterMinmaxPropertiesEXT(){
        super(new VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT());
    }

    public VulkanPhysicalDeviceSamplerFilterMinmaxPropertiesEXT(VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT getVk(){
        return (VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT) super.getVk();
    }

    public VulkanPhysicalDeviceSamplerFilterMinmaxPropertiesEXT(VulkanStructureType sType, VulkanObject pNext, VulkanBool32 filterMinmaxSingleComponentFormats, VulkanBool32 filterMinmaxImageComponentMapping) {
        super(new VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT(sType.getVk(), pNext.getVk(), filterMinmaxSingleComponentFormats.getVk(), filterMinmaxImageComponentMapping.getVk()));
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

    public VulkanBool32 getFilterMinmaxSingleComponentFormats() {
        return new VulkanBool32(getVk().getFilterMinmaxSingleComponentFormats());
    }

    public void setFilterMinmaxSingleComponentFormats(VulkanBool32 filterMinmaxSingleComponentFormats) {
        getVk().setFilterMinmaxSingleComponentFormats(filterMinmaxSingleComponentFormats.getVk());
    }

    public VulkanBool32 getFilterMinmaxImageComponentMapping() {
        return new VulkanBool32(getVk().getFilterMinmaxImageComponentMapping());
    }

    public void setFilterMinmaxImageComponentMapping(VulkanBool32 filterMinmaxImageComponentMapping) {
        getVk().setFilterMinmaxImageComponentMapping(filterMinmaxImageComponentMapping.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceSamplerFilterMinmaxPropertiesEXT implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceSamplerFilterMinmaxPropertiesEXT> {
        public Array(VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceSamplerFilterMinmaxPropertiesEXT o){
            this(new VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Array getVk(){
            return (VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceSamplerFilterMinmaxPropertiesEXT get(int i){
            return new VulkanPhysicalDeviceSamplerFilterMinmaxPropertiesEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Pointer getVk(){
            return (VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceSamplerFilterMinmaxPropertiesEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Pointer.Array getVk(){
                return (VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Pointer get(int i){
                return new VulkanPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Pointer(getVk().get(i));
            }
        }
    }
}
