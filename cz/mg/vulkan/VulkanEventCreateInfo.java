package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkEventCreateInfo.html">khronos documentation</a>
 **/
public class VulkanEventCreateInfo extends VulkanObject {
    public VulkanEventCreateInfo(){
        super(new VkEventCreateInfo());
    }

    public VulkanEventCreateInfo(VkEventCreateInfo vk){
        super(vk);
    }

    @Override
    public VkEventCreateInfo getVk(){
        return (VkEventCreateInfo) super.getVk();
    }
    public VulkanEventCreateInfo(VulkanObject pNext, VulkanEventCreateFlags flags) {
        super(new VkEventCreateInfo(pNext.getVk(), flags.getVk()));
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

    public VulkanEventCreateFlags getFlags() {
        return new VulkanEventCreateFlags(getVk().getFlags());
    }

    public void setFlags(VulkanEventCreateFlags flags) {
        getVk().setFlags(flags.getVk());
    }


    public static class Array extends VulkanEventCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanEventCreateInfo> {
        public Array(VkEventCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkEventCreateInfo.Array(count));
        }

        public Array(int count, VulkanEventCreateInfo o){
            this(new VkEventCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkEventCreateInfo.Array getVk(){
            return (VkEventCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanEventCreateInfo get(int i){
            return new VulkanEventCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkEventCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkEventCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkEventCreateInfo.Pointer(value));
        }

        @Override
        public VkEventCreateInfo.Pointer getVk(){
            return (VkEventCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanEventCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanEventCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkEventCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanEventCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkEventCreateInfo.Pointer.Array getVk(){
                return (VkEventCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanEventCreateInfo.Pointer get(int i){
                return new VulkanEventCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
