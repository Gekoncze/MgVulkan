package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPhysicalDeviceBlendOperationAdvancedFeaturesEXT extends VulkanObject {
    public VulkanPhysicalDeviceBlendOperationAdvancedFeaturesEXT(){
        super(new VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT());
    }

    public VulkanPhysicalDeviceBlendOperationAdvancedFeaturesEXT(VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT getVk(){
        return (VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT) super.getVk();
    }

    public VulkanPhysicalDeviceBlendOperationAdvancedFeaturesEXT(VulkanStructureType sType, VulkanObject pNext, VulkanBool32 advancedBlendCoherentOperations) {
        super(new VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT(sType.getVk(), pNext.getVk(), advancedBlendCoherentOperations.getVk()));
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

    public VulkanBool32 getAdvancedBlendCoherentOperations() {
        return new VulkanBool32(getVk().getAdvancedBlendCoherentOperations());
    }

    public void setAdvancedBlendCoherentOperations(VulkanBool32 advancedBlendCoherentOperations) {
        getVk().setAdvancedBlendCoherentOperations(advancedBlendCoherentOperations.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceBlendOperationAdvancedFeaturesEXT implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceBlendOperationAdvancedFeaturesEXT> {
        public Array(VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceBlendOperationAdvancedFeaturesEXT o){
            this(new VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Array getVk(){
            return (VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceBlendOperationAdvancedFeaturesEXT get(int i){
            return new VulkanPhysicalDeviceBlendOperationAdvancedFeaturesEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Pointer getVk(){
            return (VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceBlendOperationAdvancedFeaturesEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Pointer.Array getVk(){
                return (VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Pointer get(int i){
                return new VulkanPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Pointer(getVk().get(i));
            }
        }
    }
}
