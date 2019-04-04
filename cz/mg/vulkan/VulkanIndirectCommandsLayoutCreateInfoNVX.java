package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkIndirectCommandsLayoutCreateInfoNVX.html">khronos documentation</a>
 **/
public class VulkanIndirectCommandsLayoutCreateInfoNVX extends VulkanObject {
    public VulkanIndirectCommandsLayoutCreateInfoNVX(){
        super(new VkIndirectCommandsLayoutCreateInfoNVX());
    }

    public VulkanIndirectCommandsLayoutCreateInfoNVX(VkIndirectCommandsLayoutCreateInfoNVX vk){
        super(vk);
    }

    @Override
    public VkIndirectCommandsLayoutCreateInfoNVX getVk(){
        return (VkIndirectCommandsLayoutCreateInfoNVX) super.getVk();
    }
    public VulkanIndirectCommandsLayoutCreateInfoNVX(VulkanObject pNext, VulkanPipelineBindPoint pipelineBindPoint, VulkanIndirectCommandsLayoutUsageFlagsNVX flags, VulkanUInt32 tokenCount, VulkanIndirectCommandsLayoutTokenNVX pTokens) {
        super(new VkIndirectCommandsLayoutCreateInfoNVX(pNext.getVk(), pipelineBindPoint.getVk(), flags.getVk(), tokenCount.getVk(), pTokens.getVk()));
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

    public VulkanPipelineBindPoint getPipelineBindPoint() {
        return new VulkanPipelineBindPoint(getVk().getPipelineBindPoint());
    }

    public void setPipelineBindPoint(VulkanPipelineBindPoint pipelineBindPoint) {
        getVk().setPipelineBindPoint(pipelineBindPoint.getVk());
    }

    public VulkanIndirectCommandsLayoutUsageFlagsNVX getFlags() {
        return new VulkanIndirectCommandsLayoutUsageFlagsNVX(getVk().getFlags());
    }

    public void setFlags(VulkanIndirectCommandsLayoutUsageFlagsNVX flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanUInt32 getTokenCount() {
        return new VulkanUInt32(getVk().getTokenCount());
    }

    public void setTokenCount(VulkanUInt32 tokenCount) {
        getVk().setTokenCount(tokenCount.getVk());
    }

    public VulkanIndirectCommandsLayoutTokenNVX getPTokens() {
        return new VulkanIndirectCommandsLayoutTokenNVX(getVk().getPTokens());
    }

    public void setPTokens(VulkanIndirectCommandsLayoutTokenNVX pTokens) {
        getVk().setPTokens(pTokens.getVk());
    }


    public static class Array extends VulkanIndirectCommandsLayoutCreateInfoNVX implements cz.mg.collections.array.ReadonlyArray<VulkanIndirectCommandsLayoutCreateInfoNVX> {
        public Array(VkIndirectCommandsLayoutCreateInfoNVX.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkIndirectCommandsLayoutCreateInfoNVX.Array(count));
        }

        public Array(int count, VulkanIndirectCommandsLayoutCreateInfoNVX o){
            this(new VkIndirectCommandsLayoutCreateInfoNVX.Array(count, o.getVk()));
        }

        @Override
        public VkIndirectCommandsLayoutCreateInfoNVX.Array getVk(){
            return (VkIndirectCommandsLayoutCreateInfoNVX.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanIndirectCommandsLayoutCreateInfoNVX get(int i){
            return new VulkanIndirectCommandsLayoutCreateInfoNVX(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkIndirectCommandsLayoutCreateInfoNVX.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkIndirectCommandsLayoutCreateInfoNVX.Pointer());
        }

        public Pointer(long value) {
            this(new VkIndirectCommandsLayoutCreateInfoNVX.Pointer(value));
        }

        @Override
        public VkIndirectCommandsLayoutCreateInfoNVX.Pointer getVk(){
            return (VkIndirectCommandsLayoutCreateInfoNVX.Pointer) super.getVk();
        }

        public static class Array extends VulkanIndirectCommandsLayoutCreateInfoNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanIndirectCommandsLayoutCreateInfoNVX.Pointer> {
            public Array(int count) {
                super(new VkIndirectCommandsLayoutCreateInfoNVX.Pointer.Array(count));
            }

            public Array(VulkanIndirectCommandsLayoutCreateInfoNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkIndirectCommandsLayoutCreateInfoNVX.Pointer.Array getVk(){
                return (VkIndirectCommandsLayoutCreateInfoNVX.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanIndirectCommandsLayoutCreateInfoNVX.Pointer get(int i){
                return new VulkanIndirectCommandsLayoutCreateInfoNVX.Pointer(getVk().get(i));
            }
        }
    }
}
