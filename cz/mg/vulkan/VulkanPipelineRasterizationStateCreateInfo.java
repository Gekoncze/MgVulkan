package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineRasterizationStateCreateInfo.html">khronos documentation</a>
 **/
public class VulkanPipelineRasterizationStateCreateInfo extends VulkanObject {
    public VulkanPipelineRasterizationStateCreateInfo(){
        super(new VkPipelineRasterizationStateCreateInfo());
    }

    public VulkanPipelineRasterizationStateCreateInfo(VkPipelineRasterizationStateCreateInfo vk){
        super(vk);
    }

    @Override
    public VkPipelineRasterizationStateCreateInfo getVk(){
        return (VkPipelineRasterizationStateCreateInfo) super.getVk();
    }
    public VulkanPipelineRasterizationStateCreateInfo(VulkanObject pNext, VulkanPipelineRasterizationStateCreateFlags flags, VulkanBool32 depthClampEnable, VulkanBool32 rasterizerDiscardEnable, VulkanPolygonMode polygonMode, VulkanCullModeFlags cullMode, VulkanFrontFace frontFace, VulkanBool32 depthBiasEnable, VulkanFloat depthBiasConstantFactor, VulkanFloat depthBiasClamp, VulkanFloat depthBiasSlopeFactor, VulkanFloat lineWidth) {
        super(new VkPipelineRasterizationStateCreateInfo(pNext.getVk(), flags.getVk(), depthClampEnable.getVk(), rasterizerDiscardEnable.getVk(), polygonMode.getVk(), cullMode.getVk(), frontFace.getVk(), depthBiasEnable.getVk(), depthBiasConstantFactor.getVk(), depthBiasClamp.getVk(), depthBiasSlopeFactor.getVk(), lineWidth.getVk()));
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

    public VulkanPipelineRasterizationStateCreateFlags getFlags() {
        return new VulkanPipelineRasterizationStateCreateFlags(getVk().getFlags());
    }

    public void setFlags(VulkanPipelineRasterizationStateCreateFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanBool32 getDepthClampEnable() {
        return new VulkanBool32(getVk().getDepthClampEnable());
    }

    public void setDepthClampEnable(VulkanBool32 depthClampEnable) {
        getVk().setDepthClampEnable(depthClampEnable.getVk());
    }

    public VulkanBool32 getRasterizerDiscardEnable() {
        return new VulkanBool32(getVk().getRasterizerDiscardEnable());
    }

    public void setRasterizerDiscardEnable(VulkanBool32 rasterizerDiscardEnable) {
        getVk().setRasterizerDiscardEnable(rasterizerDiscardEnable.getVk());
    }

    public VulkanPolygonMode getPolygonMode() {
        return new VulkanPolygonMode(getVk().getPolygonMode());
    }

    public void setPolygonMode(VulkanPolygonMode polygonMode) {
        getVk().setPolygonMode(polygonMode.getVk());
    }

    public VulkanCullModeFlags getCullMode() {
        return new VulkanCullModeFlags(getVk().getCullMode());
    }

    public void setCullMode(VulkanCullModeFlags cullMode) {
        getVk().setCullMode(cullMode.getVk());
    }

    public VulkanFrontFace getFrontFace() {
        return new VulkanFrontFace(getVk().getFrontFace());
    }

    public void setFrontFace(VulkanFrontFace frontFace) {
        getVk().setFrontFace(frontFace.getVk());
    }

    public VulkanBool32 getDepthBiasEnable() {
        return new VulkanBool32(getVk().getDepthBiasEnable());
    }

    public void setDepthBiasEnable(VulkanBool32 depthBiasEnable) {
        getVk().setDepthBiasEnable(depthBiasEnable.getVk());
    }

    public VulkanFloat getDepthBiasConstantFactor() {
        return new VulkanFloat(getVk().getDepthBiasConstantFactor());
    }

    public void setDepthBiasConstantFactor(VulkanFloat depthBiasConstantFactor) {
        getVk().setDepthBiasConstantFactor(depthBiasConstantFactor.getVk());
    }

    public VulkanFloat getDepthBiasClamp() {
        return new VulkanFloat(getVk().getDepthBiasClamp());
    }

    public void setDepthBiasClamp(VulkanFloat depthBiasClamp) {
        getVk().setDepthBiasClamp(depthBiasClamp.getVk());
    }

    public VulkanFloat getDepthBiasSlopeFactor() {
        return new VulkanFloat(getVk().getDepthBiasSlopeFactor());
    }

    public void setDepthBiasSlopeFactor(VulkanFloat depthBiasSlopeFactor) {
        getVk().setDepthBiasSlopeFactor(depthBiasSlopeFactor.getVk());
    }

    public VulkanFloat getLineWidth() {
        return new VulkanFloat(getVk().getLineWidth());
    }

    public void setLineWidth(VulkanFloat lineWidth) {
        getVk().setLineWidth(lineWidth.getVk());
    }


    public static class Array extends VulkanPipelineRasterizationStateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineRasterizationStateCreateInfo> {
        public Array(VkPipelineRasterizationStateCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineRasterizationStateCreateInfo.Array(count));
        }

        public Array(int count, VulkanPipelineRasterizationStateCreateInfo o){
            this(new VkPipelineRasterizationStateCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineRasterizationStateCreateInfo.Array getVk(){
            return (VkPipelineRasterizationStateCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineRasterizationStateCreateInfo get(int i){
            return new VulkanPipelineRasterizationStateCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineRasterizationStateCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineRasterizationStateCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineRasterizationStateCreateInfo.Pointer(value));
        }

        @Override
        public VkPipelineRasterizationStateCreateInfo.Pointer getVk(){
            return (VkPipelineRasterizationStateCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineRasterizationStateCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineRasterizationStateCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkPipelineRasterizationStateCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanPipelineRasterizationStateCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineRasterizationStateCreateInfo.Pointer.Array getVk(){
                return (VkPipelineRasterizationStateCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineRasterizationStateCreateInfo.Pointer get(int i){
                return new VulkanPipelineRasterizationStateCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
