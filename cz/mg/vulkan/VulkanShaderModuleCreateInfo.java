package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanShaderModuleCreateInfo extends VulkanObject {
    public VulkanShaderModuleCreateInfo(){
        super(new VkShaderModuleCreateInfo());
    }

    public VulkanShaderModuleCreateInfo(VkShaderModuleCreateInfo vk){
        super(vk);
    }

    @Override
    public VkShaderModuleCreateInfo getVk(){
        return (VkShaderModuleCreateInfo) super.getVk();
    }
    public VulkanShaderModuleCreateInfo(VulkanObject pNext, VulkanShaderModuleCreateFlags flags, VulkanSize codeSize, VulkanUInt32 pCode) {
        super(new VkShaderModuleCreateInfo(pNext.getVk(), flags.getVk(), codeSize.getVk(), pCode.getVk()));
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

    public VulkanShaderModuleCreateFlags getFlags() {
        return new VulkanShaderModuleCreateFlags(getVk().getFlags());
    }

    public void setFlags(VulkanShaderModuleCreateFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanSize getCodeSize() {
        return new VulkanSize(getVk().getCodeSize());
    }

    public void setCodeSize(VulkanSize codeSize) {
        getVk().setCodeSize(codeSize.getVk());
    }

    public VulkanUInt32 getPCode() {
        return new VulkanUInt32(getVk().getPCode());
    }

    public void setPCode(VulkanUInt32 pCode) {
        getVk().setPCode(pCode.getVk());
    }


    public static class Array extends VulkanShaderModuleCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanShaderModuleCreateInfo> {
        public Array(VkShaderModuleCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkShaderModuleCreateInfo.Array(count));
        }

        public Array(int count, VulkanShaderModuleCreateInfo o){
            this(new VkShaderModuleCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkShaderModuleCreateInfo.Array getVk(){
            return (VkShaderModuleCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanShaderModuleCreateInfo get(int i){
            return new VulkanShaderModuleCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkShaderModuleCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkShaderModuleCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkShaderModuleCreateInfo.Pointer(value));
        }

        @Override
        public VkShaderModuleCreateInfo.Pointer getVk(){
            return (VkShaderModuleCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanShaderModuleCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanShaderModuleCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkShaderModuleCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanShaderModuleCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkShaderModuleCreateInfo.Pointer.Array getVk(){
                return (VkShaderModuleCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanShaderModuleCreateInfo.Pointer get(int i){
                return new VulkanShaderModuleCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
