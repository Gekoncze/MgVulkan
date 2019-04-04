package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorUpdateTemplateCreateInfo.html">khronos documentation</a>
 **/
public class VulkanDescriptorUpdateTemplateCreateInfo extends VulkanObject {
    public VulkanDescriptorUpdateTemplateCreateInfo(){
        super(new VkDescriptorUpdateTemplateCreateInfo());
    }

    public VulkanDescriptorUpdateTemplateCreateInfo(VkDescriptorUpdateTemplateCreateInfo vk){
        super(vk);
    }

    @Override
    public VkDescriptorUpdateTemplateCreateInfo getVk(){
        return (VkDescriptorUpdateTemplateCreateInfo) super.getVk();
    }
    public VulkanDescriptorUpdateTemplateCreateInfo(VulkanObject pNext, VulkanDescriptorUpdateTemplateCreateFlags flags, VulkanUInt32 descriptorUpdateEntryCount, VulkanDescriptorUpdateTemplateEntry pDescriptorUpdateEntries, VulkanDescriptorUpdateTemplateType templateType, VulkanDescriptorSetLayout descriptorSetLayout, VulkanPipelineBindPoint pipelineBindPoint, VulkanPipelineLayout pipelineLayout, VulkanUInt32 set) {
        super(new VkDescriptorUpdateTemplateCreateInfo(pNext.getVk(), flags.getVk(), descriptorUpdateEntryCount.getVk(), pDescriptorUpdateEntries.getVk(), templateType.getVk(), descriptorSetLayout.getVk(), pipelineBindPoint.getVk(), pipelineLayout.getVk(), set.getVk()));
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

    public VulkanDescriptorUpdateTemplateCreateFlags getFlags() {
        return new VulkanDescriptorUpdateTemplateCreateFlags(getVk().getFlags());
    }

    public void setFlags(VulkanDescriptorUpdateTemplateCreateFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanUInt32 getDescriptorUpdateEntryCount() {
        return new VulkanUInt32(getVk().getDescriptorUpdateEntryCount());
    }

    public void setDescriptorUpdateEntryCount(VulkanUInt32 descriptorUpdateEntryCount) {
        getVk().setDescriptorUpdateEntryCount(descriptorUpdateEntryCount.getVk());
    }

    public VulkanDescriptorUpdateTemplateEntry getPDescriptorUpdateEntries() {
        return new VulkanDescriptorUpdateTemplateEntry(getVk().getPDescriptorUpdateEntries());
    }

    public void setPDescriptorUpdateEntries(VulkanDescriptorUpdateTemplateEntry pDescriptorUpdateEntries) {
        getVk().setPDescriptorUpdateEntries(pDescriptorUpdateEntries.getVk());
    }

    public VulkanDescriptorUpdateTemplateType getTemplateType() {
        return new VulkanDescriptorUpdateTemplateType(getVk().getTemplateType());
    }

    public void setTemplateType(VulkanDescriptorUpdateTemplateType templateType) {
        getVk().setTemplateType(templateType.getVk());
    }

    public VulkanDescriptorSetLayout getDescriptorSetLayout() {
        return new VulkanDescriptorSetLayout(getVk().getDescriptorSetLayout());
    }

    public void setDescriptorSetLayout(VulkanDescriptorSetLayout descriptorSetLayout) {
        getVk().setDescriptorSetLayout(descriptorSetLayout.getVk());
    }

    public VulkanPipelineBindPoint getPipelineBindPoint() {
        return new VulkanPipelineBindPoint(getVk().getPipelineBindPoint());
    }

    public void setPipelineBindPoint(VulkanPipelineBindPoint pipelineBindPoint) {
        getVk().setPipelineBindPoint(pipelineBindPoint.getVk());
    }

    public VulkanPipelineLayout getPipelineLayout() {
        return new VulkanPipelineLayout(getVk().getPipelineLayout());
    }

    public void setPipelineLayout(VulkanPipelineLayout pipelineLayout) {
        getVk().setPipelineLayout(pipelineLayout.getVk());
    }

    public VulkanUInt32 getSet() {
        return new VulkanUInt32(getVk().getSet());
    }

    public void setSet(VulkanUInt32 set) {
        getVk().setSet(set.getVk());
    }


    public static class Array extends VulkanDescriptorUpdateTemplateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorUpdateTemplateCreateInfo> {
        public Array(VkDescriptorUpdateTemplateCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDescriptorUpdateTemplateCreateInfo.Array(count));
        }

        public Array(int count, VulkanDescriptorUpdateTemplateCreateInfo o){
            this(new VkDescriptorUpdateTemplateCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkDescriptorUpdateTemplateCreateInfo.Array getVk(){
            return (VkDescriptorUpdateTemplateCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDescriptorUpdateTemplateCreateInfo get(int i){
            return new VulkanDescriptorUpdateTemplateCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDescriptorUpdateTemplateCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDescriptorUpdateTemplateCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkDescriptorUpdateTemplateCreateInfo.Pointer(value));
        }

        @Override
        public VkDescriptorUpdateTemplateCreateInfo.Pointer getVk(){
            return (VkDescriptorUpdateTemplateCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanDescriptorUpdateTemplateCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorUpdateTemplateCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkDescriptorUpdateTemplateCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanDescriptorUpdateTemplateCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDescriptorUpdateTemplateCreateInfo.Pointer.Array getVk(){
                return (VkDescriptorUpdateTemplateCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDescriptorUpdateTemplateCreateInfo.Pointer get(int i){
                return new VulkanDescriptorUpdateTemplateCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
