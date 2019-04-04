package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineCacheCreateInfo.html">khronos documentation</a>
 **/
public class VulkanPipelineCacheCreateInfo extends VulkanObject {
    public VulkanPipelineCacheCreateInfo(){
        super(new VkPipelineCacheCreateInfo());
    }

    public VulkanPipelineCacheCreateInfo(VkPipelineCacheCreateInfo vk){
        super(vk);
    }

    @Override
    public VkPipelineCacheCreateInfo getVk(){
        return (VkPipelineCacheCreateInfo) super.getVk();
    }
    public VulkanPipelineCacheCreateInfo(VulkanObject pNext, VulkanPipelineCacheCreateFlags flags, VulkanSize initialDataSize, VulkanObject pInitialData) {
        super(new VkPipelineCacheCreateInfo(pNext.getVk(), flags.getVk(), initialDataSize.getVk(), pInitialData.getVk()));
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

    public VulkanPipelineCacheCreateFlags getFlags() {
        return new VulkanPipelineCacheCreateFlags(getVk().getFlags());
    }

    public void setFlags(VulkanPipelineCacheCreateFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanSize getInitialDataSize() {
        return new VulkanSize(getVk().getInitialDataSize());
    }

    public void setInitialDataSize(VulkanSize initialDataSize) {
        getVk().setInitialDataSize(initialDataSize.getVk());
    }

    public VulkanObject getPInitialData() {
        return new VulkanObject(getVk().getPInitialData());
    }

    public void setPInitialData(VulkanObject pInitialData) {
        getVk().setPInitialData(pInitialData.getVk());
    }


    public static class Array extends VulkanPipelineCacheCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineCacheCreateInfo> {
        public Array(VkPipelineCacheCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineCacheCreateInfo.Array(count));
        }

        public Array(int count, VulkanPipelineCacheCreateInfo o){
            this(new VkPipelineCacheCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineCacheCreateInfo.Array getVk(){
            return (VkPipelineCacheCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineCacheCreateInfo get(int i){
            return new VulkanPipelineCacheCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineCacheCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineCacheCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineCacheCreateInfo.Pointer(value));
        }

        @Override
        public VkPipelineCacheCreateInfo.Pointer getVk(){
            return (VkPipelineCacheCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineCacheCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineCacheCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkPipelineCacheCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanPipelineCacheCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineCacheCreateInfo.Pointer.Array getVk(){
                return (VkPipelineCacheCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineCacheCreateInfo.Pointer get(int i){
                return new VulkanPipelineCacheCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
