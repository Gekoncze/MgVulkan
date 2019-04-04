package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkQueryPoolCreateInfo.html">khronos documentation</a>
 **/
public class VulkanQueryPoolCreateInfo extends VulkanObject {
    public VulkanQueryPoolCreateInfo(){
        super(new VkQueryPoolCreateInfo());
    }

    public VulkanQueryPoolCreateInfo(VkQueryPoolCreateInfo vk){
        super(vk);
    }

    @Override
    public VkQueryPoolCreateInfo getVk(){
        return (VkQueryPoolCreateInfo) super.getVk();
    }
    public VulkanQueryPoolCreateInfo(VulkanObject pNext, VulkanQueryPoolCreateFlags flags, VulkanQueryType queryType, VulkanUInt32 queryCount, VulkanQueryPipelineStatisticFlags pipelineStatistics) {
        super(new VkQueryPoolCreateInfo(pNext.getVk(), flags.getVk(), queryType.getVk(), queryCount.getVk(), pipelineStatistics.getVk()));
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

    public VulkanQueryPoolCreateFlags getFlags() {
        return new VulkanQueryPoolCreateFlags(getVk().getFlags());
    }

    public void setFlags(VulkanQueryPoolCreateFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanQueryType getQueryType() {
        return new VulkanQueryType(getVk().getQueryType());
    }

    public void setQueryType(VulkanQueryType queryType) {
        getVk().setQueryType(queryType.getVk());
    }

    public VulkanUInt32 getQueryCount() {
        return new VulkanUInt32(getVk().getQueryCount());
    }

    public void setQueryCount(VulkanUInt32 queryCount) {
        getVk().setQueryCount(queryCount.getVk());
    }

    public VulkanQueryPipelineStatisticFlags getPipelineStatistics() {
        return new VulkanQueryPipelineStatisticFlags(getVk().getPipelineStatistics());
    }

    public void setPipelineStatistics(VulkanQueryPipelineStatisticFlags pipelineStatistics) {
        getVk().setPipelineStatistics(pipelineStatistics.getVk());
    }


    public static class Array extends VulkanQueryPoolCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanQueryPoolCreateInfo> {
        public Array(VkQueryPoolCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkQueryPoolCreateInfo.Array(count));
        }

        public Array(int count, VulkanQueryPoolCreateInfo o){
            this(new VkQueryPoolCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkQueryPoolCreateInfo.Array getVk(){
            return (VkQueryPoolCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanQueryPoolCreateInfo get(int i){
            return new VulkanQueryPoolCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkQueryPoolCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkQueryPoolCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkQueryPoolCreateInfo.Pointer(value));
        }

        @Override
        public VkQueryPoolCreateInfo.Pointer getVk(){
            return (VkQueryPoolCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanQueryPoolCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanQueryPoolCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkQueryPoolCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanQueryPoolCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkQueryPoolCreateInfo.Pointer.Array getVk(){
                return (VkQueryPoolCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanQueryPoolCreateInfo.Pointer get(int i){
                return new VulkanQueryPoolCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
