package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineTessellationDomainOriginStateCreateInfo.html">khronos documentation</a>
 **/
public class VulkanPipelineTessellationDomainOriginStateCreateInfo extends VulkanObject {
    public VulkanPipelineTessellationDomainOriginStateCreateInfo(){
        super(new VkPipelineTessellationDomainOriginStateCreateInfo());
    }

    public VulkanPipelineTessellationDomainOriginStateCreateInfo(VkPipelineTessellationDomainOriginStateCreateInfo vk){
        super(vk);
    }

    @Override
    public VkPipelineTessellationDomainOriginStateCreateInfo getVk(){
        return (VkPipelineTessellationDomainOriginStateCreateInfo) super.getVk();
    }
    public VulkanPipelineTessellationDomainOriginStateCreateInfo(VulkanObject pNext, VulkanTessellationDomainOrigin domainOrigin) {
        super(new VkPipelineTessellationDomainOriginStateCreateInfo(pNext.getVk(), domainOrigin.getVk()));
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

    public VulkanTessellationDomainOrigin getDomainOrigin() {
        return new VulkanTessellationDomainOrigin(getVk().getDomainOrigin());
    }

    public void setDomainOrigin(VulkanTessellationDomainOrigin domainOrigin) {
        getVk().setDomainOrigin(domainOrigin.getVk());
    }


    public static class Array extends VulkanPipelineTessellationDomainOriginStateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineTessellationDomainOriginStateCreateInfo> {
        public Array(VkPipelineTessellationDomainOriginStateCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineTessellationDomainOriginStateCreateInfo.Array(count));
        }

        public Array(int count, VulkanPipelineTessellationDomainOriginStateCreateInfo o){
            this(new VkPipelineTessellationDomainOriginStateCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineTessellationDomainOriginStateCreateInfo.Array getVk(){
            return (VkPipelineTessellationDomainOriginStateCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineTessellationDomainOriginStateCreateInfo get(int i){
            return new VulkanPipelineTessellationDomainOriginStateCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineTessellationDomainOriginStateCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineTessellationDomainOriginStateCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineTessellationDomainOriginStateCreateInfo.Pointer(value));
        }

        @Override
        public VkPipelineTessellationDomainOriginStateCreateInfo.Pointer getVk(){
            return (VkPipelineTessellationDomainOriginStateCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineTessellationDomainOriginStateCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineTessellationDomainOriginStateCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkPipelineTessellationDomainOriginStateCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanPipelineTessellationDomainOriginStateCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineTessellationDomainOriginStateCreateInfo.Pointer.Array getVk(){
                return (VkPipelineTessellationDomainOriginStateCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineTessellationDomainOriginStateCreateInfo.Pointer get(int i){
                return new VulkanPipelineTessellationDomainOriginStateCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
