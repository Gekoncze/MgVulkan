package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.html">khronos documentation</a>
 **/
public class VulkanPhysicalDeviceBlendOperationAdvancedPropertiesEXT extends VulkanObject {
    public VulkanPhysicalDeviceBlendOperationAdvancedPropertiesEXT(){
        super(new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT());
    }

    public VulkanPhysicalDeviceBlendOperationAdvancedPropertiesEXT(VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT getVk(){
        return (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT) super.getVk();
    }

    public VulkanPhysicalDeviceBlendOperationAdvancedPropertiesEXT(VulkanStructureType sType, VulkanObject pNext, VulkanUInt32 advancedBlendMaxColorAttachments, VulkanBool32 advancedBlendIndependentBlend, VulkanBool32 advancedBlendNonPremultipliedSrcColor, VulkanBool32 advancedBlendNonPremultipliedDstColor, VulkanBool32 advancedBlendCorrelatedOverlap, VulkanBool32 advancedBlendAllOperations) {
        super(new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(sType.getVk(), pNext.getVk(), advancedBlendMaxColorAttachments.getVk(), advancedBlendIndependentBlend.getVk(), advancedBlendNonPremultipliedSrcColor.getVk(), advancedBlendNonPremultipliedDstColor.getVk(), advancedBlendCorrelatedOverlap.getVk(), advancedBlendAllOperations.getVk()));
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

    public VulkanUInt32 getAdvancedBlendMaxColorAttachments() {
        return new VulkanUInt32(getVk().getAdvancedBlendMaxColorAttachments());
    }

    public void setAdvancedBlendMaxColorAttachments(VulkanUInt32 advancedBlendMaxColorAttachments) {
        getVk().setAdvancedBlendMaxColorAttachments(advancedBlendMaxColorAttachments.getVk());
    }

    public VulkanBool32 getAdvancedBlendIndependentBlend() {
        return new VulkanBool32(getVk().getAdvancedBlendIndependentBlend());
    }

    public void setAdvancedBlendIndependentBlend(VulkanBool32 advancedBlendIndependentBlend) {
        getVk().setAdvancedBlendIndependentBlend(advancedBlendIndependentBlend.getVk());
    }

    public VulkanBool32 getAdvancedBlendNonPremultipliedSrcColor() {
        return new VulkanBool32(getVk().getAdvancedBlendNonPremultipliedSrcColor());
    }

    public void setAdvancedBlendNonPremultipliedSrcColor(VulkanBool32 advancedBlendNonPremultipliedSrcColor) {
        getVk().setAdvancedBlendNonPremultipliedSrcColor(advancedBlendNonPremultipliedSrcColor.getVk());
    }

    public VulkanBool32 getAdvancedBlendNonPremultipliedDstColor() {
        return new VulkanBool32(getVk().getAdvancedBlendNonPremultipliedDstColor());
    }

    public void setAdvancedBlendNonPremultipliedDstColor(VulkanBool32 advancedBlendNonPremultipliedDstColor) {
        getVk().setAdvancedBlendNonPremultipliedDstColor(advancedBlendNonPremultipliedDstColor.getVk());
    }

    public VulkanBool32 getAdvancedBlendCorrelatedOverlap() {
        return new VulkanBool32(getVk().getAdvancedBlendCorrelatedOverlap());
    }

    public void setAdvancedBlendCorrelatedOverlap(VulkanBool32 advancedBlendCorrelatedOverlap) {
        getVk().setAdvancedBlendCorrelatedOverlap(advancedBlendCorrelatedOverlap.getVk());
    }

    public VulkanBool32 getAdvancedBlendAllOperations() {
        return new VulkanBool32(getVk().getAdvancedBlendAllOperations());
    }

    public void setAdvancedBlendAllOperations(VulkanBool32 advancedBlendAllOperations) {
        getVk().setAdvancedBlendAllOperations(advancedBlendAllOperations.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceBlendOperationAdvancedPropertiesEXT implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceBlendOperationAdvancedPropertiesEXT> {
        public Array(VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceBlendOperationAdvancedPropertiesEXT o){
            this(new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Array getVk(){
            return (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceBlendOperationAdvancedPropertiesEXT get(int i){
            return new VulkanPhysicalDeviceBlendOperationAdvancedPropertiesEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Pointer getVk(){
            return (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceBlendOperationAdvancedPropertiesEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Pointer.Array getVk(){
                return (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Pointer get(int i){
                return new VulkanPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Pointer(getVk().get(i));
            }
        }
    }
}
