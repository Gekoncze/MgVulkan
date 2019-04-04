package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkShaderResourceUsageAMD.html">khronos documentation</a>
 **/
public class VulkanShaderResourceUsageAMD extends VulkanObject {
    public VulkanShaderResourceUsageAMD(){
        super(new VkShaderResourceUsageAMD());
    }

    public VulkanShaderResourceUsageAMD(VkShaderResourceUsageAMD vk){
        super(vk);
    }

    @Override
    public VkShaderResourceUsageAMD getVk(){
        return (VkShaderResourceUsageAMD) super.getVk();
    }

    public VulkanShaderResourceUsageAMD(VulkanUInt32 numUsedVgprs, VulkanUInt32 numUsedSgprs, VulkanUInt32 ldsSizePerLocalWorkGroup, VulkanSize ldsUsageSizeInBytes, VulkanSize scratchMemUsageInBytes) {
        super(new VkShaderResourceUsageAMD(numUsedVgprs.getVk(), numUsedSgprs.getVk(), ldsSizePerLocalWorkGroup.getVk(), ldsUsageSizeInBytes.getVk(), scratchMemUsageInBytes.getVk()));
    }

    public VulkanUInt32 getNumUsedVgprs() {
        return new VulkanUInt32(getVk().getNumUsedVgprs());
    }

    public void setNumUsedVgprs(VulkanUInt32 numUsedVgprs) {
        getVk().setNumUsedVgprs(numUsedVgprs.getVk());
    }

    public VulkanUInt32 getNumUsedSgprs() {
        return new VulkanUInt32(getVk().getNumUsedSgprs());
    }

    public void setNumUsedSgprs(VulkanUInt32 numUsedSgprs) {
        getVk().setNumUsedSgprs(numUsedSgprs.getVk());
    }

    public VulkanUInt32 getLdsSizePerLocalWorkGroup() {
        return new VulkanUInt32(getVk().getLdsSizePerLocalWorkGroup());
    }

    public void setLdsSizePerLocalWorkGroup(VulkanUInt32 ldsSizePerLocalWorkGroup) {
        getVk().setLdsSizePerLocalWorkGroup(ldsSizePerLocalWorkGroup.getVk());
    }

    public VulkanSize getLdsUsageSizeInBytes() {
        return new VulkanSize(getVk().getLdsUsageSizeInBytes());
    }

    public void setLdsUsageSizeInBytes(VulkanSize ldsUsageSizeInBytes) {
        getVk().setLdsUsageSizeInBytes(ldsUsageSizeInBytes.getVk());
    }

    public VulkanSize getScratchMemUsageInBytes() {
        return new VulkanSize(getVk().getScratchMemUsageInBytes());
    }

    public void setScratchMemUsageInBytes(VulkanSize scratchMemUsageInBytes) {
        getVk().setScratchMemUsageInBytes(scratchMemUsageInBytes.getVk());
    }


    public static class Array extends VulkanShaderResourceUsageAMD implements cz.mg.collections.array.ReadonlyArray<VulkanShaderResourceUsageAMD> {
        public Array(VkShaderResourceUsageAMD.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkShaderResourceUsageAMD.Array(count));
        }

        public Array(int count, VulkanShaderResourceUsageAMD o){
            this(new VkShaderResourceUsageAMD.Array(count, o.getVk()));
        }

        @Override
        public VkShaderResourceUsageAMD.Array getVk(){
            return (VkShaderResourceUsageAMD.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanShaderResourceUsageAMD get(int i){
            return new VulkanShaderResourceUsageAMD(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkShaderResourceUsageAMD.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkShaderResourceUsageAMD.Pointer());
        }

        public Pointer(long value) {
            this(new VkShaderResourceUsageAMD.Pointer(value));
        }

        @Override
        public VkShaderResourceUsageAMD.Pointer getVk(){
            return (VkShaderResourceUsageAMD.Pointer) super.getVk();
        }

        public static class Array extends VulkanShaderResourceUsageAMD.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanShaderResourceUsageAMD.Pointer> {
            public Array(int count) {
                super(new VkShaderResourceUsageAMD.Pointer.Array(count));
            }

            public Array(VulkanShaderResourceUsageAMD[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkShaderResourceUsageAMD.Pointer.Array getVk(){
                return (VkShaderResourceUsageAMD.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanShaderResourceUsageAMD.Pointer get(int i){
                return new VulkanShaderResourceUsageAMD.Pointer(getVk().get(i));
            }
        }
    }
}
