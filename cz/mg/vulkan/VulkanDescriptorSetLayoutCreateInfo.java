package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorSetLayoutCreateInfo.html">khronos documentation</a>
 **/
public class VulkanDescriptorSetLayoutCreateInfo extends VulkanObject {
    public VulkanDescriptorSetLayoutCreateInfo(){
        super(new VkDescriptorSetLayoutCreateInfo());
    }

    public VulkanDescriptorSetLayoutCreateInfo(VkDescriptorSetLayoutCreateInfo vk){
        super(vk);
    }

    @Override
    public VkDescriptorSetLayoutCreateInfo getVk(){
        return (VkDescriptorSetLayoutCreateInfo) super.getVk();
    }
    public VulkanDescriptorSetLayoutCreateInfo(VulkanObject pNext, VulkanDescriptorSetLayoutCreateFlags flags, VulkanUInt32 bindingCount, VulkanDescriptorSetLayoutBinding pBindings) {
        super(new VkDescriptorSetLayoutCreateInfo(pNext.getVk(), flags.getVk(), bindingCount.getVk(), pBindings.getVk()));
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

    public VulkanDescriptorSetLayoutCreateFlags getFlags() {
        return new VulkanDescriptorSetLayoutCreateFlags(getVk().getFlags());
    }

    public void setFlags(VulkanDescriptorSetLayoutCreateFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanUInt32 getBindingCount() {
        return new VulkanUInt32(getVk().getBindingCount());
    }

    public void setBindingCount(VulkanUInt32 bindingCount) {
        getVk().setBindingCount(bindingCount.getVk());
    }

    public VulkanDescriptorSetLayoutBinding getPBindings() {
        return new VulkanDescriptorSetLayoutBinding(getVk().getPBindings());
    }

    public void setPBindings(VulkanDescriptorSetLayoutBinding pBindings) {
        getVk().setPBindings(pBindings.getVk());
    }


    public static class Array extends VulkanDescriptorSetLayoutCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorSetLayoutCreateInfo> {
        public Array(VkDescriptorSetLayoutCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDescriptorSetLayoutCreateInfo.Array(count));
        }

        public Array(int count, VulkanDescriptorSetLayoutCreateInfo o){
            this(new VkDescriptorSetLayoutCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkDescriptorSetLayoutCreateInfo.Array getVk(){
            return (VkDescriptorSetLayoutCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDescriptorSetLayoutCreateInfo get(int i){
            return new VulkanDescriptorSetLayoutCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDescriptorSetLayoutCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDescriptorSetLayoutCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkDescriptorSetLayoutCreateInfo.Pointer(value));
        }

        @Override
        public VkDescriptorSetLayoutCreateInfo.Pointer getVk(){
            return (VkDescriptorSetLayoutCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanDescriptorSetLayoutCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorSetLayoutCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkDescriptorSetLayoutCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanDescriptorSetLayoutCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDescriptorSetLayoutCreateInfo.Pointer.Array getVk(){
                return (VkDescriptorSetLayoutCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDescriptorSetLayoutCreateInfo.Pointer get(int i){
                return new VulkanDescriptorSetLayoutCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
