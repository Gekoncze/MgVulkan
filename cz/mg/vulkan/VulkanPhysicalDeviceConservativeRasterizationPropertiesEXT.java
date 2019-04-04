package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDeviceConservativeRasterizationPropertiesEXT.html">khronos documentation</a>
 **/
public class VulkanPhysicalDeviceConservativeRasterizationPropertiesEXT extends VulkanObject {
    public VulkanPhysicalDeviceConservativeRasterizationPropertiesEXT(){
        super(new VkPhysicalDeviceConservativeRasterizationPropertiesEXT());
    }

    public VulkanPhysicalDeviceConservativeRasterizationPropertiesEXT(VkPhysicalDeviceConservativeRasterizationPropertiesEXT vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT getVk(){
        return (VkPhysicalDeviceConservativeRasterizationPropertiesEXT) super.getVk();
    }

    public VulkanPhysicalDeviceConservativeRasterizationPropertiesEXT(VulkanStructureType sType, VulkanObject pNext, VulkanFloat primitiveOverestimationSize, VulkanFloat maxExtraPrimitiveOverestimationSize, VulkanFloat extraPrimitiveOverestimationSizeGranularity, VulkanBool32 primitiveUnderestimation, VulkanBool32 conservativePointAndLineRasterization, VulkanBool32 degenerateTrianglesRasterized, VulkanBool32 degenerateLinesRasterized, VulkanBool32 fullyCoveredFragmentShaderInputVariable, VulkanBool32 conservativeRasterizationPostDepthCoverage) {
        super(new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(sType.getVk(), pNext.getVk(), primitiveOverestimationSize.getVk(), maxExtraPrimitiveOverestimationSize.getVk(), extraPrimitiveOverestimationSizeGranularity.getVk(), primitiveUnderestimation.getVk(), conservativePointAndLineRasterization.getVk(), degenerateTrianglesRasterized.getVk(), degenerateLinesRasterized.getVk(), fullyCoveredFragmentShaderInputVariable.getVk(), conservativeRasterizationPostDepthCoverage.getVk()));
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

    public VulkanFloat getPrimitiveOverestimationSize() {
        return new VulkanFloat(getVk().getPrimitiveOverestimationSize());
    }

    public void setPrimitiveOverestimationSize(VulkanFloat primitiveOverestimationSize) {
        getVk().setPrimitiveOverestimationSize(primitiveOverestimationSize.getVk());
    }

    public VulkanFloat getMaxExtraPrimitiveOverestimationSize() {
        return new VulkanFloat(getVk().getMaxExtraPrimitiveOverestimationSize());
    }

    public void setMaxExtraPrimitiveOverestimationSize(VulkanFloat maxExtraPrimitiveOverestimationSize) {
        getVk().setMaxExtraPrimitiveOverestimationSize(maxExtraPrimitiveOverestimationSize.getVk());
    }

    public VulkanFloat getExtraPrimitiveOverestimationSizeGranularity() {
        return new VulkanFloat(getVk().getExtraPrimitiveOverestimationSizeGranularity());
    }

    public void setExtraPrimitiveOverestimationSizeGranularity(VulkanFloat extraPrimitiveOverestimationSizeGranularity) {
        getVk().setExtraPrimitiveOverestimationSizeGranularity(extraPrimitiveOverestimationSizeGranularity.getVk());
    }

    public VulkanBool32 getPrimitiveUnderestimation() {
        return new VulkanBool32(getVk().getPrimitiveUnderestimation());
    }

    public void setPrimitiveUnderestimation(VulkanBool32 primitiveUnderestimation) {
        getVk().setPrimitiveUnderestimation(primitiveUnderestimation.getVk());
    }

    public VulkanBool32 getConservativePointAndLineRasterization() {
        return new VulkanBool32(getVk().getConservativePointAndLineRasterization());
    }

    public void setConservativePointAndLineRasterization(VulkanBool32 conservativePointAndLineRasterization) {
        getVk().setConservativePointAndLineRasterization(conservativePointAndLineRasterization.getVk());
    }

    public VulkanBool32 getDegenerateTrianglesRasterized() {
        return new VulkanBool32(getVk().getDegenerateTrianglesRasterized());
    }

    public void setDegenerateTrianglesRasterized(VulkanBool32 degenerateTrianglesRasterized) {
        getVk().setDegenerateTrianglesRasterized(degenerateTrianglesRasterized.getVk());
    }

    public VulkanBool32 getDegenerateLinesRasterized() {
        return new VulkanBool32(getVk().getDegenerateLinesRasterized());
    }

    public void setDegenerateLinesRasterized(VulkanBool32 degenerateLinesRasterized) {
        getVk().setDegenerateLinesRasterized(degenerateLinesRasterized.getVk());
    }

    public VulkanBool32 getFullyCoveredFragmentShaderInputVariable() {
        return new VulkanBool32(getVk().getFullyCoveredFragmentShaderInputVariable());
    }

    public void setFullyCoveredFragmentShaderInputVariable(VulkanBool32 fullyCoveredFragmentShaderInputVariable) {
        getVk().setFullyCoveredFragmentShaderInputVariable(fullyCoveredFragmentShaderInputVariable.getVk());
    }

    public VulkanBool32 getConservativeRasterizationPostDepthCoverage() {
        return new VulkanBool32(getVk().getConservativeRasterizationPostDepthCoverage());
    }

    public void setConservativeRasterizationPostDepthCoverage(VulkanBool32 conservativeRasterizationPostDepthCoverage) {
        getVk().setConservativeRasterizationPostDepthCoverage(conservativeRasterizationPostDepthCoverage.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceConservativeRasterizationPropertiesEXT implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceConservativeRasterizationPropertiesEXT> {
        public Array(VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceConservativeRasterizationPropertiesEXT o){
            this(new VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Array getVk(){
            return (VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceConservativeRasterizationPropertiesEXT get(int i){
            return new VulkanPhysicalDeviceConservativeRasterizationPropertiesEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Pointer getVk(){
            return (VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceConservativeRasterizationPropertiesEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceConservativeRasterizationPropertiesEXT.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceConservativeRasterizationPropertiesEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Pointer.Array getVk(){
                return (VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceConservativeRasterizationPropertiesEXT.Pointer get(int i){
                return new VulkanPhysicalDeviceConservativeRasterizationPropertiesEXT.Pointer(getVk().get(i));
            }
        }
    }
}
