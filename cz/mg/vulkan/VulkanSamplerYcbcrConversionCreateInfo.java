package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSamplerYcbcrConversionCreateInfo extends VulkanObject {
    public VulkanSamplerYcbcrConversionCreateInfo(){
        super(new VkSamplerYcbcrConversionCreateInfo());
    }

    public VulkanSamplerYcbcrConversionCreateInfo(VkSamplerYcbcrConversionCreateInfo vk){
        super(vk);
    }

    @Override
    public VkSamplerYcbcrConversionCreateInfo getVk(){
        return (VkSamplerYcbcrConversionCreateInfo) super.getVk();
    }
    public VulkanSamplerYcbcrConversionCreateInfo(VulkanObject pNext, VulkanFormat format, VulkanSamplerYcbcrModelConversion ycbcrModel, VulkanSamplerYcbcrRange ycbcrRange, VulkanComponentMapping components, VulkanChromaLocation xChromaOffset, VulkanChromaLocation yChromaOffset, VulkanFilter chromaFilter, VulkanBool32 forceExplicitReconstruction) {
        super(new VkSamplerYcbcrConversionCreateInfo(pNext.getVk(), format.getVk(), ycbcrModel.getVk(), ycbcrRange.getVk(), components.getVk(), xChromaOffset.getVk(), yChromaOffset.getVk(), chromaFilter.getVk(), forceExplicitReconstruction.getVk()));
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

    public VulkanFormat getFormat() {
        return new VulkanFormat(getVk().getFormat());
    }

    public void setFormat(VulkanFormat format) {
        getVk().setFormat(format.getVk());
    }

    public VulkanSamplerYcbcrModelConversion getYcbcrModel() {
        return new VulkanSamplerYcbcrModelConversion(getVk().getYcbcrModel());
    }

    public void setYcbcrModel(VulkanSamplerYcbcrModelConversion ycbcrModel) {
        getVk().setYcbcrModel(ycbcrModel.getVk());
    }

    public VulkanSamplerYcbcrRange getYcbcrRange() {
        return new VulkanSamplerYcbcrRange(getVk().getYcbcrRange());
    }

    public void setYcbcrRange(VulkanSamplerYcbcrRange ycbcrRange) {
        getVk().setYcbcrRange(ycbcrRange.getVk());
    }

    public VulkanComponentMapping getComponents() {
        return new VulkanComponentMapping(getVk().getComponents());
    }

    public void setComponents(VulkanComponentMapping components) {
        getVk().setComponents(components.getVk());
    }

    public VulkanChromaLocation getXChromaOffset() {
        return new VulkanChromaLocation(getVk().getXChromaOffset());
    }

    public void setXChromaOffset(VulkanChromaLocation xChromaOffset) {
        getVk().setXChromaOffset(xChromaOffset.getVk());
    }

    public VulkanChromaLocation getYChromaOffset() {
        return new VulkanChromaLocation(getVk().getYChromaOffset());
    }

    public void setYChromaOffset(VulkanChromaLocation yChromaOffset) {
        getVk().setYChromaOffset(yChromaOffset.getVk());
    }

    public VulkanFilter getChromaFilter() {
        return new VulkanFilter(getVk().getChromaFilter());
    }

    public void setChromaFilter(VulkanFilter chromaFilter) {
        getVk().setChromaFilter(chromaFilter.getVk());
    }

    public VulkanBool32 getForceExplicitReconstruction() {
        return new VulkanBool32(getVk().getForceExplicitReconstruction());
    }

    public void setForceExplicitReconstruction(VulkanBool32 forceExplicitReconstruction) {
        getVk().setForceExplicitReconstruction(forceExplicitReconstruction.getVk());
    }


    public static class Array extends VulkanSamplerYcbcrConversionCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanSamplerYcbcrConversionCreateInfo> {
        public Array(VkSamplerYcbcrConversionCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSamplerYcbcrConversionCreateInfo.Array(count));
        }

        public Array(int count, VulkanSamplerYcbcrConversionCreateInfo o){
            this(new VkSamplerYcbcrConversionCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkSamplerYcbcrConversionCreateInfo.Array getVk(){
            return (VkSamplerYcbcrConversionCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSamplerYcbcrConversionCreateInfo get(int i){
            return new VulkanSamplerYcbcrConversionCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSamplerYcbcrConversionCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSamplerYcbcrConversionCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkSamplerYcbcrConversionCreateInfo.Pointer(value));
        }

        @Override
        public VkSamplerYcbcrConversionCreateInfo.Pointer getVk(){
            return (VkSamplerYcbcrConversionCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanSamplerYcbcrConversionCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSamplerYcbcrConversionCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkSamplerYcbcrConversionCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanSamplerYcbcrConversionCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSamplerYcbcrConversionCreateInfo.Pointer.Array getVk(){
                return (VkSamplerYcbcrConversionCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSamplerYcbcrConversionCreateInfo.Pointer get(int i){
                return new VulkanSamplerYcbcrConversionCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
